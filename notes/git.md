❯ mkdir Cats
❯ cd Cats
❯ git init --initial-branch=main
Initialized empty Git repository in /home/julnarot.../Cats/.git/
❯ git status
On branch main
nothing to commit, working tree clean

❯ touch index.html
❯ git status
On branch main

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   index.html

❯ git commit -m "Create an empty index.html file"
[main (root-commit) 2ac02b8] Create an empty index.html file
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 index.html
❯ git log
commit 2ac02b83ee4ca5bb5a2ab22cb3db35c34e54865e (HEAD -> main)
Author: @Julnarot <rauljhonatan.tola@gmail.com>
Date:   Sat Nov 4 21:20:02 2023 -0500

    Create an empty index.html file

adding `<h1>Our Feline Friends</h1>` to index.html and save

❯ git commit -a -m "Add a heading to index.html"
[main dfcba42] Add a heading to index.html
 1 file changed, 1 insertion(+)

change and save index.html content by
```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset='UTF-8'>
    <title>Our Feline Friends</title>
  </head>
  <body>
    <h1>Our Feline Friends</h1>
    <p>Eventually we will put cat pictures here.</p>
    <hr>
  </body>
</html>
```

❯ git diff
diff --git a/index.html b/index.html
index f758a7e..9946d07 100644
--- a/index.html
+++ b/index.html
@@ -1 +1,12 @@
-<h1>Out feline Friends</h1>
+<!DOCTYPE html>
+<html>
+  <head>
+    <meta charset='UTF-8'>
+    <title>Our Feline Friends</title>
+  </head>
+  <body>
+    <h1>Our Feline Friends</h1>
+    <p>Eventually we will put cat pictures here.</p>
+    <hr>
+  </body>
+</html>
❯ git commit -m "Add HTML boilerplate to index.html" index.html
[main 7da2244] Add HTML boilerplate to index.html
 1 file changed, 12 insertions(+), 1 deletion(-)
❯ git diff

and check dont return anithing

❯ vim .gitignore
~/m/Cats main ?1 ❯                                                  59s
❯ git add -A
❯ git diff
❯ git commit -m "Make small wording change; ignore editor backups"
[main f021b5c] Make small wording change; ignore editor backups
 1 file changed, 2 insertions(+)
 create mode 100644 .gitignore
❯ git diff HEAD^
diff --git a/.gitignore b/.gitignore
new file mode 100644
index 0000000..6dd1b30
--- /dev/null
+++ b/.gitignore
@@ -0,0 +1,2 @@
+*.bak
+*~


❯ mkdir CSS
❯ git status
On branch main
nothing to commit, working tree clean
❯ touch CSS/.git-keep
❯ git status
On branch main
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        CSS/

nothing added to commit but untracked files present (use "git add" to track)
❯ git add CSS
❯ git status
On branch main
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   CSS/.git-keep

❯ rm CSS/.git-keep
❯ cd CSS
❯ vim site.css
❯ cd ..
❯ vim index.html
❯ git add .
❯ git commit -m "Add a simple stylesheet"
[main 3e8408c] Add a simple stylesheet
 2 files changed, 3 insertions(+)
 create mode 100644 CSS/site.css
❯ git log
commit 3e8408cf17eb2a559bbafd79a5553f98218e8479 (HEAD -> main)
Author: @Julnarot <rauljhonatan.tola@gmail.com>
Date:   Sat Nov 4 21:36:02 2023 -0500

    Add a simple stylesheet

commit f021b5c9c890ad3d0532b4245773eaa22a3c2a1a
Author: @Julnarot <rauljhonatan.tola@gmail.com>
Date:   Sat Nov 4 21:28:56 2023 -0500

    Make small wording change; ignore editor backups

commit 7da2244bb35e712aa660118d6577c81af64c659d
Author: @Julnarot <rauljhonatan.tola@gmail.com>
Date:   Sat Nov 4 21:25:38 2023 -0500

    Add HTML boilerplate to index.html

commit dfcba42e97e12ee53275d8dd78ce994e53597c9e
Author: @Julnarot <rauljhonatan.tola@gmail.com>
Date:   Sat Nov 4 21:21:47 2023 -0500

    Add a heading to index.html

commit 2ac02b83ee4ca5bb5a2ab22cb3db35c34e54865e
Author: @Julnarot <rauljhonatan.tola@gmail.com>
Date:   Sat Nov 4 21:20:02 2023 -0500

    Create an empty index.html file
❯ git log --inline
fatal: unrecognized argument: --inline
❯ git log --oneline
3e8408c (HEAD -> main) Add a simple stylesheet
f021b5c Make small wording change; ignore editor backups
7da2244 Add HTML boilerplate to index.html
dfcba42 Add a heading to index.html
2ac02b8 Create an empty index.html file

# Error Fixing

 vim index.html
❯ git commit --amend --no-edit
[main 7d16ce2] Add a simple stylesheet
 Date: Sat Nov 4 21:36:02 2023 -0500
 2 files changed, 3 insertions(+)
 create mode 100644 CSS/site.css
❯ git log
commit 7d16ce295d2fb62578c96ae06e35d24e59f6d9a1 (HEAD -> main)
Author: @Julnarot <rauljhonatan.tola@gmail.com>
Date:   Sat Nov 4 21:36:02 2023 -0500

    Add a simple stylesheet

...........
❯ git commit --amend
[main 6d27115] Add a simple stylesheet; change title
 Date: Sat Nov 4 21:36:02 2023 -0500
 2 files changed, 3 insertions(+)
 create mode 100644 CSS/site.css
❯ git log
commit 6d271157a1295bc16130242002ec0da5cc87fdf5 (HEAD -> main)
Author: @Julnarot <rauljhonatan.tola@gmail.com>
Date:   Sat Nov 4 21:36:02 2023 -0500

    Add a simple stylesheet; change title

commit f021b5c9c890ad3d0532b4245773eaa22a3c2a1a
Author: @Julnarot <rauljhonatan.tola@gmail.com>
Date:   Sat Nov 4 21:28:56 2023 -0500

    Make small wording change; ignore editor backups

........
❯ git log --oneline
6d27115 (HEAD -> main) Add a simple stylesheet; change title
f021b5c Make small wording change; ignore editor backups
7da2244 Add HTML boilerplate to index.html
dfcba42 Add a heading to index.html
2ac02b8 Create an empty index.html file
❯ git status
On branch main
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   index.html

no changes added to commit (use "git add" and/or "git commit -a")
❯ git add .
❯ git commit --amend --no-edit
[main d85fd94] Add a simple stylesheet; change title
 Date: Sat Nov 4 21:36:02 2023 -0500
 2 files changed, 4 insertions(+), 1 deletion(-)
 create mode 100644 CSS/site.css
❯ git status+
git: 'status+' is not a git command. See 'git --help'.

The most similar command is
        status
❯ git status
On branch main
nothing to commit, working tree clean
❯ git lof
git: 'lof' is not a git command. See 'git --help'.

The most similar command is
        log
❯ git log
commit d85fd946744daca6b53cf03c942fa77845be85c8 (HEAD -> main)
Author: @Julnarot <rauljhonatan.tola@gmail.com>
Date:   Sat Nov 4 21:36:02 2023 -0500

    Add a simple stylesheet; change title

commit f021b5c9c890ad3d0532b4245773eaa22a3c2a1a
Author: @Julnarot <rauljhonatan.tola@gmail.com>
Date:   Sat Nov 4 21:28:56 2023 -0500

    Make small wording change; ignore editor backups

.....
❯ ls
 CSS   index.html
❯ git status
On branch main
nothing to commit, working tree clean
❯ rm index.html
❯ git checkout -- index.html
❯ git status
On branch main
nothing to commit, working tree clean
❯ ls -la
drwxr-xr-x julnarot julnarot 4.0 KB Sat Nov  4 21:46:54 2023  .
drwxr-xr-x julnarot julnarot 4.0 KB Sat Nov  4 21:13:43 2023  ..
drwxr-xr-x julnarot julnarot 4.0 KB Sat Nov  4 21:46:56 2023  .git
.rw-r--r-- julnarot julnarot   9 B  Sat Nov  4 21:27:19 2023  .gitignore
drwxr-xr-x julnarot julnarot 4.0 KB Sat Nov  4 21:33:22 2023  CSS
.rw-r--r-- julnarot julnarot 286 B  Sat Nov  4 21:46:54 2023  index.html
❯ git rm index.html
rm 'index.html'
❯ ls -la
drwxr-xr-x julnarot julnarot 4.0 KB Sat Nov  4 21:47:53 2023  .
drwxr-xr-x julnarot julnarot 4.0 KB Sat Nov  4 21:13:43 2023  ..
drwxr-xr-x julnarot julnarot 4.0 KB Sat Nov  4 21:47:53 2023  .git
.rw-r--r-- julnarot julnarot   9 B  Sat Nov  4 21:27:19 2023  .gitignore
drwxr-xr-x julnarot julnarot 4.0 KB Sat Nov  4 21:33:22 2023  CSS
~/m/Cats main +1 ❯
❯ ls
 CSS
~/m/Cats main +1 ❯
❯ git checkout -- index.html
error: pathspec 'index.html' did not match any file(s) known to git
❯ git reset HEAD index.html
Unstaged changes after reset:
D       index.html
❯ git checkout  -- index.html
❯ git status
On branch main
nothing to commit, working tree clean
❯ dir
CSS  index.html
❯ vim index.html
❯ git add .
❯ git commit -m "add top container"
[main 862502d] add top container
 1 file changed, 1 insertion(+)
❯ git log --oneline
862502d (HEAD -> main) add top container
d85fd94 Add a simple stylesheet; change title
f021b5c Make small wording change; ignore editor backups
7da2244 Add HTML boilerplate to index.html
dfcba42 Add a heading to index.html
2ac02b8 Create an empty index.html file
❯ git status
On branch main
nothing to commit, working tree clean
❯ git reset --hard HEAD^
HEAD is now at d85fd94 Add a simple stylesheet; change title
❯ git status
On branch main
nothing to commit, working tree clean
❯ ls
 CSS   index.html

❯ git log --oneline
d85fd94 (HEAD -> main) Add a simple stylesheet; change title
f021b5c Make small wording change; ignore editor backups
7da2244 Add HTML boilerplate to index.html
dfcba42 Add a heading to index.html
2ac02b8 Create an empty index.html file

## PRactice on azure

user-julnarot [ ~ ]$ ls
Cats  clouddrive
user-julnarot [ ~ ]$ gitch^C
user-julnarot [ ~ ]$ cd Cats/
user-julnarot [ ~/Cats ]$ git checkout -- index.html
error: pathspec 'index.html' did not match any file(s) known to git
user-julnarot [ ~/Cats ]$ git checkout -- index.h^C
user-julnarot [ ~/Cats ]$ echo "<h1>hola</h1>" > index.html
user-julnarot [ ~/Cats ]$ mkdir CSS
user-julnarot [ ~/Cats ]$ echo "*{color: red}" > CSS/style.css
user-julnarot [ ~/Cats ]$ git commit -m "^C
user-julnarot [ ~/Cats ]$ git add .
user-julnarot [ ~/Cats ]$ git commit -m "add new index and css file"
Author identity unknown

user-julnarot [ ~/Cats ]$ rm  index.html 
user-julnarot [ ~/Cats ]$ ls
CSS
user-julnarot [ ~/Cats ]$ git checkout -- index.html
user-julnarot [ ~/Cats ]$ ls
CSS  index.html
user-julnarot [ ~/Cats ]$ git rm index.html 
error: the following file has changes staged in the index:
    index.html
(use --cached to keep the file, or -f to force removal)
user-julnarot [ ~/Cats ]$ git rm index.html 
error: the following file has changes staged in the index:
    index.html
(use --cached to keep the file, or -f to force removal)
user-julnarot [ ~/Cats ]$ git status
On branch main

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   CSS/style.css
        new file:   index.html

user-julnarot [ ~/Cats ]$ git add .
user-julnarot [ ~/Cats ]$ git status
On branch main
nothing to commit, working tree clean
user-julnarot [ ~/Cats ]$ rm index.html
user-julnarot [ ~/Cats ]$ git checkout -- index.html
user-julnarot [ ~/Cats ]$ ls
CSS  index.html
user-julnarot [ ~/Cats ]$ git status
On branch main
nothing to commit, working tree clean
user-julnarot [ ~/Cats ]$ git rm index.html 
rm 'index.html'
user-julnarot [ ~/Cats ]$ ls
CSS
user-julnarot [ ~/Cats ]$ git  checkout  index.html
error: pathspec 'index.html' did not match any file(s) known to git
user-julnarot [ ~/Cats ]$ git reset HEAD index.html
Unstaged changes after reset:
D       index.html
user-julnarot [ ~/Cats ]$ git checkout -- index.html
user-julnarot [ ~/Cats ]$ vim index.html 
user-julnarot [ ~/Cats ]$ vim index.html 
user-julnarot [ ~/Cats ]$ git commit -m "purposely overwrite the content of index.html"
On branch main
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   index.html

no changes added to commit (use "git add" and/or "git commit -a")
user-julnarot [ ~/Cats ]$ git commit -m "purposely overwrite the content of index.html" index.html 
[main d5e7f79] purposely overwrite the content of index.html
 1 file changed, 1 insertion(+), 1 deletion(-)
user-julnarot [ ~/Cats ]$ git log -n1
commit d5e7f79c6cdc073a076fbc86efa639831a5b5793 (HEAD -> main)
Author: @Julnarot <rauljhonatan.tola@gmail.com>
Date:   Sun Nov 5 03:41:34 2023 +0000

    purposely overwrite the content of index.html
user-julnarot [ ~/Cats ]$ git checkout -- index.html
user-julnarot [ ~/Cats ]$ cat index.html 
<div>container erro</div>
user-julnarot [ ~/Cats ]$ git revert --no-edit HEAD
[main 1c29701] Revert "purposely overwrite the content of index.html"
 Date: Sun Nov 5 03:43:07 2023 +0000
 1 file changed, 1 insertion(+), 1 deletion(-)
user-julnarot [ ~/Cats ]$ cat index.html 
<h1>hola</h1>
user-julnarot [ ~/Cats ]$ git log -n1
commit 1c297018def888b8fcfddc8b0d20416a84981f77 (HEAD -> main)
Author: @Julnarot <rauljhonatan.tola@gmail.com>
Date:   Sun Nov 5 03:43:07 2023 +0000

    Revert "purposely overwrite the content of index.html"
    
    This reverts commit d5e7f79c6cdc073a076fbc86efa639831a5b5793.
user-julnarot [ ~/Cats ]$

## practice 02

Requesting a Cloud Shell.Succeeded. 
Connecting terminal...

Welcome to Azure Cloud Shell

Type "az" to use Azure CLI
Type "help" to learn about Cloud Shell

user_julnarot [ ~ ]$ mkdir Cats
user_julnarot [ ~ ]$ cd $
bash: cd: $: No such file or directory
user_julnarot [ ~ ]$ cd Cats/
user_julnarot [ ~/Cats ]$ git init --inital-branch=main
error: unknown option `inital-branch=main'
usage: git init [-q | --quiet] [--bare] [--template=<template-directory>] [--shared[=<permissions>]] [<directory>]

    --template <template-directory>
                          directory from which templates will be used
    --bare                create a bare repository
    --shared[=<permissions>]
                          specify that the git repository is to be shared amongst several users
    -q, --quiet           be quiet
    --separate-git-dir <gitdir>
                          separate git dir from working tree
    -b, --initial-branch <name>
                          override the name of the initial branch
    --object-format <hash>
                          specify the hash algorithm to use

user_julnarot [ ~/Cats ]$ git init --initial-branch=main
Initialized empty Git repository in /home/user_julnarot/Cats/.git/
user_julnarot [ ~/Cats ]$ git init -b main
warning: re-init: ignored --initial-branch=main
Reinitialized existing Git repository in /home/user_julnarot/Cats/.git/
user_julnarot [ ~/Cats ]$ git config user.email "rauljhonatan.tola@gmail.com"
user_julnarot [ ~/Cats ]$ git config user.user "@Julnarot"
user_julnarot [ ~/Cats ]$ touch index.html
user_julnarot [ ~/Cats ]$ mkdir CSS
user_julnarot [ ~/Cats ]$ touch CSS/site.css
user_julnarot [ ~/Cats ]$ git add .
user_julnarot [ ~/Cats ]$ git commit -m "Create empty index.html, site.css files"
Author identity unknown

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: empty ident name (for <rauljhonatan.tola@gmail.com>) not allowed
user_julnarot [ ~/Cats ]$ touch CSS/site.css^C
user_julnarot [ ~/Cats ]$ git config --global user.email "rauljhonatan.tola@gmail.com"
user_julnarot [ ~/Cats ]$ git config --global user.ser "@Julnarot"
user_julnarot [ ~/Cats ]$ git config --global user.name "@Julnarot"
user_julnarot [ ~/Cats ]$ git config --global user.email "rauljhonatan.tola@gmail.com"
user_julnarot [ ~/Cats ]$ vim index.html 
user_julnarot [ ~/Cats ]$ vim CSS/site.css 
user_julnarot [ ~/Cats ]$ git add .
user_julnarot [ ~/Cats ]$ git commit -m "Add simple HTML and stylesheet"
[main (root-commit) f1d1b66] Add simple HTML and stylesheet
 2 files changed, 15 insertions(+)
 create mode 100644 CSS/site.css
 create mode 100644 index.html
user_julnarot [ ~/Cats ]$ git log --oneline
f1d1b66 (HEAD -> main) Add simple HTML and stylesheet
user_julnarot [ ~/Cats ]$ cd
user_julnarot [ ~ ]$ mkdir Alice
user_julnarot [ ~ ]$ cd Alice
user_julnarot [ ~/Alice ]$ git clone ../Cats/
Cloning into 'Cats'...
done.
user_julnarot [ ~/Alice ]




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
