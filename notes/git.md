## revert commit
```bash 
$ user(development) ❯ git log

commit 97fca459b03fa8fb37175bb3f4fc3c74644ff669 (origin/development)
Author: @Julnarot <rauljhonatan.tola@gmail.com>
Date:   Tue Apr 11 12:44:53 2023 -0500

    new file 05
```
Revert to id commit
```bash
$ user(development) ❯ git revert 97fca459b03fa8fb37175bb3f4fc3c74644ff669
```
## revert merge
```bash
commit e35cdcfec3dbf80691374781d10380e010623ae8
Merge: f2e6ae2 efd09cb  <----
Author: Raul Jonatan <rauljhonatan.tola@gmail.com>
Date:   Tue Apr 11 12:39:49 2023 -0500

    Merge pull request #1 from julnarot/new-file
    
    New file
```
Revert to id from merge
```bash
$ user(development) ❯ git revert f2e6ae2 efd09cb
Removing file02.txt
[development 094fb26] Revert "file 02"
 1 file changed, 1 deletion(-)
 delete mode 100644 file02.txt
Removing file04.txt
[development 36471a8] Revert "new file"
 1 file changed, 1 deletion(-)
 delete mode 100644 file04.txt
```


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
