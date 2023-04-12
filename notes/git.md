## Restore specific commit in local and remote repository

Execute git reset with commit id in development branch
```bash
$ user(development) ❯ git reset --hard 32b017d6da349d57d3fda3ed8e0f4604a017c800
HEAD is now at 32b017d file 01

```

Now force local development branch in remote
```bash
$ user(development) ❯ git push -f origin development
Total 0 (delta 0), reused 0 (delta 0)
To https://repository.com/julnarot/first-repo.git
 + 843c954...32b017d development -> development (forced update)

```

## replace develop remote in main remote branch, ours strategy

checkout and pull main local repository
```bash
$ user(development) ❯ git checkout main
Switched to branch 'main'
Your branch is up to date with 'origin/main'.

$ user(main) ❯ git pull origin main
From https://repository.com/julnarot/first-repo.git
 * branch            main       -> FETCH_HEAD
Already up to date.

```

back to development branch
```bash
$ user(development) ❯ git checkout development
Switched to branch 'development'

```

Execute ours strategy short form, large form: `--strategy=ours`
```bash
$ user(development) ❯ git merge -s ours main
Merge made by the 'ours' strategy.

```

return to main branch
```bash
$ user(development) ❯ git checkout main
Switched to branch 'main'
Your branch is up to date with 'origin/main'.

```
And merge 
```bash
$ user(main) ❯ git merge development
Updating 963e502..771c801
Fast-forward
 file02.txt | 1 -
 file03.txt | 1 -
 2 files changed, 2 deletions(-)
 delete mode 100644 file02.txt
 delete mode 100644 file03.txt

```
publis main in remote 
```bash
$ user(main) ❯ git push origin main
Enumerating objects: 1, done.
Counting objects: 100% (1/1), done.
Writing objects: 100% (1/1), 237 bytes | 237.00 KiB/s, done.
Total 1 (delta 0), reused 0 (delta 0)
To https://repository.com/julnarot/first-repo.git
   963e502..771c801  main -> main

```
