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

## creating merge request at local remote julnarot -> aliice repository

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
user_julnarot [ ~/Alice ]$ pwd
/home/user_julnarot/Alice
user_julnarot [ ~/Alice ]$ git pulkl
git: 'pulkl' is not a git command. See 'git --help'.

The most similar command is
        pull
user_julnarot [ ~/Alice ]$ git pull
fatal: not a git repository (or any parent up to mount point /home)
Stopping at filesystem boundary (GIT_DISCOVERY_ACROSS_FILESYSTEM not set).
user_julnarot [ ~/Alice ]$ ls
Cats
user_julnarot [ ~/Alice ]$ cd Cats/
user_julnarot [ ~/Alice/Cats ]$ git pull
Already up to date.
user_julnarot [ ~/Alice/Cats ]$ git config user.name "Alice"
user_julnarot [ ~/Alice/Cats ]$ git config user.email "alice@contoso.co"
user_julnarot [ ~/Alice/Cats ]$ vim CSS/site.css 
user_julnarot [ ~/Alice/Cats ]$ git commit -m "Change background color to light blue"
On branch main
Your branch is up to date with 'origin/main'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   CSS/site.css

no changes added to commit (use "git add" and/or "git commit -a")
user_julnarot [ ~/Alice/Cats ]$ git commit -a -m "Change background color to light blue"
[main 9fa0c70] Change background color to light blue
 1 file changed, 1 insertion(+), 1 deletion(-)
user_julnarot [ ~/Alice/Cats ]$ git request-pull -p origin/main .
warn: refs/heads/main found at . but points to a different object
warn: Are you sure you pushed 'HEAD' there?
The following changes since commit f1d1b663d4cce1feedb5ce83b522391f203706f1:

  Add simple HTML and stylesheet (2023-11-05 04:06:41 +0000)

are available in the Git repository at:

  . 

for you to fetch changes up to 9fa0c7023d9b387a42bec0cf55301d6cec8aece4:

  Change background color to light blue (2023-11-05 04:12:00 +0000)

----------------------------------------------------------------
Alice (1):
      Change background color to light blue

 CSS/site.css | 2 +-
 1 file changed, 1 insertion(+), 1 deletion(-)

diff --git a/CSS/site.css b/CSS/site.css
index 33323b5..20f4f19 100644
--- a/CSS/site.css
+++ b/CSS/site.css
@@ -1,2 +1,2 @@
 h1, h2, h3, h4, h5, h6 { font-family: sans-serif; }
-body { font-family: serif; }
+body { font-family: serif; background-color: #F0FFF8;}
user_julnarot [ ~/Alice/Cats ]$ cd
user_julnarot [ ~ ]$ cd Cats/
user_julnarot [ ~/Cats ]$ git remote add remote-alice ../Alice/Cats/
user_julnarot [ ~/Cats ]$ git pull remote-alice main
remote: Enumerating objects: 7, done.
remote: Counting objects: 100% (7/7), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 4 (delta 1), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (4/4), 365 bytes | 365.00 KiB/s, done.
From ../Alice/Cats
 * branch            main       -> FETCH_HEAD
 * [new branch]      main       -> remote-alice/main
Updating f1d1b66..9fa0c70
Fast-forward
 CSS/site.css | 2 +-
 1 file changed, 1 insertion(+), 1 deletion(-)



## Collaborate in a shared repository


user_julnarot [ ~/Cats ]$ cd
user_julnarot [ ~ ]$ mkdir Shared.git
user_julnarot [ ~ ]$ cd Shared.git/
user_julnarot [ ~/Shared.git ]$ git init --bare
hint: Using 'master' as the name for the initial branch. This default branch name
hint: is subject to change. To configure the initial branch name to use in all
hint: of your new repositories, which will suppress this warning, call:
hint: 
hint:   git config --global init.defaultBranch <name>
hint: 
hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
hint: 'development'. The just-created branch can be renamed via this command:
hint: 
hint:   git branch -m <name>
Initialized empty Git repository in /home/user_julnarot/Shared.git/
user_julnarot [ ~/Shared.git ]$ git status
fatal: this operation must be run in a work tree
user_julnarot [ ~/Shared.git ]$ ls
branches  config  description  HEAD  hooks  info  objects  refs
user_julnarot [ ~/Shared.git ]$ ^[[200~git symbolic-ref HEAD refs/heads/main~^C
user_julnarot [ ~/Shared.git ]$ git symbolic-ref HEAD refs/heads/main
user_julnarot [ ~/Shared.git ]$ cd ../Cats/
user_julnarot [ ~/Cats ]$ ls
CSS  index.html
user_julnarot [ ~/Cats ]$ git remote add origin ../Shared.git/
user_julnarot [ ~/Cats ]$ git push origin main
Enumerating objects: 9, done.
Counting objects: 100% (9/9), done.
Delta compression using up to 3 threads
Compressing objects: 100% (7/7), done.
Writing objects: 100% (9/9), 887 bytes | 443.00 KiB/s, done.
Total 9 (delta 1), reused 0 (delta 0), pack-reused 0
To ../Shared.git/
 * [new branch]      main -> main
user_julnarot [ ~/Cats ]$ git branch --set-upstream-to origin/main
Branch 'main' set up to track remote branch 'main' from 'origin'.
user_julnarot [ ~/Cats ]$ cd ..
user_julnarot [ ~ ]$ mkdir Bob
user_julnarot [ ~ ]$ cd Bob/
user_julnarot [ ~/Bob ]$ git clone ../Shared.git/ .
Cloning into '.'...
done.
user_julnarot [ ~/Bob ]$ cd ../Alice/
user_julnarot [ ~/Alice ]$ ls
Cats
user_julnarot [ ~/Alice ]$ cd Cats/
user_julnarot [ ~/Alice/Cats ]$ git remote set-url origin ../../Shared.git
user_julnarot [ ~/Alice/Cats ]$ cd
user_julnarot [ ~ ]$ cd Bob/
user_julnarot [ ~/Bob ]$ ls
CSS  index.html
user_julnarot [ ~/Bob ]$ git config user.name Bob
user_julnarot [ ~/Bob ]$ git config user.email bob@contoso.com
user_julnarot [ ~/Bob ]$ vim index.html 
user_julnarot [ ~/Bob ]$ git commit -a -m "Put a footer at the bottom of the page"
[main 55d5ab3] Put a footer at the bottom of the page
 1 file changed, 1 insertion(+)
user_julnarot [ ~/Bob ]$ git push
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 3 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 366 bytes | 366.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
To /home/user_julnarot/Bob/../Shared.git/
   9fa0c70..55d5ab3  main -> main
user_julnarot [ ~/Bob ]$ cd 
user_julnarot [ ~ ]$ cd Alice/
user_julnarot [ ~/Alice ]$ ls
Cats
user_julnarot [ ~/Alice ]$ cd Cats/
user_julnarot [ ~/Alice/Cats ]$ ls
CSS  index.html
user_julnarot [ ~/Alice/Cats ]$ vim index.html 
user_julnarot [ ~/Alice/Cats ]$ vim CSS/site.css 
user_julnarot [ ~/Alice/Cats ]$ git pull
remote: Enumerating objects: 5, done.
remote: Counting objects: 100% (5/5), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), 346 bytes | 346.00 KiB/s, done.
From ../../Shared
   f1d1b66..55d5ab3  main       -> origin/main
Updating 9fa0c70..55d5ab3
error: Your local changes to the following files would be overwritten by merge:
        index.html
Please commit your changes or stash them before you merge.
Aborting
user_julnarot [ ~/Alice/Cats ]$ git diff
diff --git a/CSS/site.css b/CSS/site.css
index 20f4f19..d58f924 100644
--- a/CSS/site.css
+++ b/CSS/site.css
@@ -1,2 +1,3 @@
 h1, h2, h3, h4, h5, h6 { font-family: sans-serif; }
 body { font-family: serif; background-color: #F0FFF8;}
+nav { background-color: #C0D8DF; }
diff --git a/index.html b/index.html
index 095469d..de8bf34 100644
--- a/index.html
+++ b/index.html
@@ -6,6 +6,7 @@
     <link rel="stylesheet" href="CSS/site.css">
   </head>
   <body>
+    <nav><a href="./index.html">home</a></nav>
     <h1>Our Feline Friends</h1>
     <p>Eventually we will put cat pictures here.</p>
     <hr>
user_julnarot [ ~/Alice/Cats ]$ git diff origin -- index.html 
diff --git a/index.html b/index.html
index cac568b..de8bf34 100644
--- a/index.html
+++ b/index.html
@@ -6,9 +6,9 @@
     <link rel="stylesheet" href="CSS/site.css">
   </head>
   <body>
+    <nav><a href="./index.html">home</a></nav>
     <h1>Our Feline Friends</h1>
     <p>Eventually we will put cat pictures here.</p>
     <hr>
   </body>
-  <footer><hr>Copyright (c) 2021 Contoso Cats</footer>
 </html>
user_julnarot [ ~/Alice/Cats ]$ git stash
Saved working directory and index state WIP on main: 9fa0c70 Change background color to light blue
user_julnarot [ ~/Alice/Cats ]$ git pull
Updating 9fa0c70..55d5ab3
Fast-forward
 index.html | 1 +
 1 file changed, 1 insertion(+)
user_julnarot [ ~/Alice/Cats ]$ git stash pop
Auto-merging index.html
On branch main
Your branch is up to date with 'origin/main'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   CSS/site.css
        modified:   index.html

no changes added to commit (use "git add" and/or "git commit -a")
Dropped refs/stash@{0} (bfdb02c72cb5a2f737318a61af510486099917b5)
user_julnarot [ ~/Alice/Cats ]$ cat CSS/site.css 
h1, h2, h3, h4, h5, h6 { font-family: sans-serif; }
body { font-family: serif; background-color: #F0FFF8;}
nav { background-color: #C0D8DF; }
user_julnarot [ ~/Alice/Cats ]$ git config user.name "Alice"
user_julnarot [ ~/Alice/Cats ]$ git config user.email "alice@contoso.com"
user_julnarot [ ~/Alice/Cats ]$ git config user.email "alice@contoso.com"^C
user_julnarot [ ~/Alice/Cats ]$ git commit -a -m "Stylize the nav bar"
[main 2aacef4] Stylize the nav bar
 2 files changed, 2 insertions(+)
user_julnarot [ ~/Alice/Cats ]$ git push
Enumerating objects: 9, done.
Counting objects: 100% (9/9), done.
Delta compression using up to 3 threads
Compressing objects: 100% (4/4), done.
Writing objects: 100% (5/5), 464 bytes | 464.00 KiB/s, done.
Total 5 (delta 2), reused 0 (delta 0), pack-reused 0
To ../../Shared.git
   55d5ab3..2aacef4  main -> main
user_julnarot [ ~/Alice/Cats ]$ cd
user_julnarot [ ~ ]$ cd Cats/
user_julnarot [ ~/Cats ]$ ls
CSS  index.html
user_julnarot [ ~/Cats ]$ git pull
remote: Enumerating objects: 12, done.
remote: Counting objects: 100% (12/12), done.
remote: Compressing objects: 100% (7/7), done.
remote: Total 8 (delta 3), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (8/8), 760 bytes | 380.00 KiB/s, done.
From ../Shared
   9fa0c70..2aacef4  main       -> origin/main
Updating 9fa0c70..2aacef4
Fast-forward
 CSS/site.css | 1 +
 index.html   | 2 ++
 2 files changed, 3 insertions(+)
user_julnarot [ ~/Cats ]$ vim indevim indeasdfasdfasdf^C
user_julnarot [ ~/Cats ]$ vim index.html 
user_julnarot [ ~/Cats ]$ cd
user_julnarot [ ~ ]$ cd Bob/
user_julnarot [ ~/Bob ]$ ls
CSS  index.html
user_julnarot [ ~/Bob ]$ git pull
remote: Enumerating objects: 9, done.
remote: Counting objects: 100% (9/9), done.
remote: Compressing objects: 100% (4/4), done.
remote: Total 5 (delta 2), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (5/5), 444 bytes | 444.00 KiB/s, done.
From /home/user_julnarot/Bob/../Shared
   55d5ab3..2aacef4  main       -> origin/main
Updating 55d5ab3..2aacef4
Fast-forward
 CSS/site.css | 1 +
 index.html   | 1 +
 2 files changed, 2 insertions(+)
user_julnarot [ ~/Bob ]$ cd
user_julnarot [ ~ ]$ zip -r Cats.zip Cats/
  adding: Cats/ (stored 0%)
  adding: Cats/index.html (deflated 37%)
  adding: Cats/.git/ (stored 0%)
  adding: Cats/.git/hooks/ (stored 0%)
  adding: Cats/.git/hooks/post-update.sample (deflated 27%)
  adding: Cats/.git/hooks/pre-applypatch.sample (deflated 38%)
  adding: Cats/.git/hooks/push-to-checkout.sample (deflated 55%)
  adding: Cats/.git/hooks/pre-merge-commit.sample (deflated 39%)
  adding: Cats/.git/hooks/pre-receive.sample (deflated 40%)
  adding: Cats/.git/hooks/pre-rebase.sample (deflated 59%)
  adding: Cats/.git/hooks/prepare-commit-msg.sample (deflated 50%)
  adding: Cats/.git/hooks/pre-push.sample (deflated 49%)
  adding: Cats/.git/hooks/update.sample (deflated 68%)
  adding: Cats/.git/hooks/applypatch-msg.sample (deflated 42%)
  adding: Cats/.git/hooks/pre-commit.sample (deflated 45%)
  adding: Cats/.git/hooks/fsmonitor-watchman.sample (deflated 62%)
  adding: Cats/.git/hooks/commit-msg.sample (deflated 44%)
  adding: Cats/.git/description (deflated 14%)
  adding: Cats/.git/FETCH_HEAD (stored 0%)
  adding: Cats/.git/COMMIT_EDITMSG (stored 0%)
  adding: Cats/.git/refs/ (stored 0%)
  adding: Cats/.git/refs/heads/ (stored 0%)
  adding: Cats/.git/refs/heads/main (stored 0%)
  adding: Cats/.git/refs/remotes/ (stored 0%)
  adding: Cats/.git/refs/remotes/remote-alice/ (stored 0%)
  adding: Cats/.git/refs/remotes/remote-alice/main (stored 0%)
  adding: Cats/.git/refs/remotes/origin/ (stored 0%)
  adding: Cats/.git/refs/remotes/origin/main (stored 0%)
  adding: Cats/.git/refs/tags/ (stored 0%)
  adding: Cats/.git/branches/ (stored 0%)
  adding: Cats/.git/ORIG_HEAD (stored 0%)
  adding: Cats/.git/objects/ (stored 0%)
  adding: Cats/.git/objects/pack/ (stored 0%)
  adding: Cats/.git/objects/c8/ (stored 0%)
  adding: Cats/.git/objects/c8/ce0974f470a7b667ba74663966025c544f5877 (stored 0%)
  adding: Cats/.git/objects/ca/ (stored 0%)
  adding: Cats/.git/objects/ca/c568b811d871e1059668d61a79c848808afb9c (stored 0%)
  adding: Cats/.git/objects/7d/ (stored 0%)
  adding: Cats/.git/objects/7d/a726714a47a1229e670e1a673a69a9348bc734 (stored 0%)
  adding: Cats/.git/objects/2a/ (stored 0%)
  adding: Cats/.git/objects/2a/acef445125bee17c2522282611ec6d35129eb8 (stored 0%)
  adding: Cats/.git/objects/20/ (stored 0%)
  adding: Cats/.git/objects/20/f4f19f878f45968833011a061904a117d3c266 (stored 0%)
  adding: Cats/.git/objects/d5/ (stored 0%)
  adding: Cats/.git/objects/d5/8f924840670c46e43002c2effd96a3f1a504c9 (stored 0%)
  adding: Cats/.git/objects/09/ (stored 0%)
  adding: Cats/.git/objects/09/5469ddf817c12ba1e20d08bba8ce6e64e3a319 (stored 0%)
  adding: Cats/.git/objects/33/ (stored 0%)
  adding: Cats/.git/objects/33/323b54e04327247e92bb204518c0643f5496d6 (stored 0%)
  adding: Cats/.git/objects/47/ (stored 0%)
  adding: Cats/.git/objects/47/dab731f21715ad8f1d5ec7b01b51dd03e68d20 (stored 0%)
  adding: Cats/.git/objects/9f/ (stored 0%)
  adding: Cats/.git/objects/9f/a0c7023d9b387a42bec0cf55301d6cec8aece4 (stored 0%)
  adding: Cats/.git/objects/e6/ (stored 0%)
  adding: Cats/.git/objects/e6/9de29bb2d1d6434b8b29ae775ad8c2e48c5391 (stored 0%)
  adding: Cats/.git/objects/86/ (stored 0%)
  adding: Cats/.git/objects/86/f79aa5bbbe86f75627082fbfbb1ae6f063241b (stored 0%)
  adding: Cats/.git/objects/b1/ (stored 0%)
  adding: Cats/.git/objects/b1/65745f18171a03394acbc9239125d55ebe4adf (stored 0%)
  adding: Cats/.git/objects/c7/ (stored 0%)
  adding: Cats/.git/objects/c7/cee515f1a633e3ffff3f84d16777931a14cd68 (stored 0%)
  adding: Cats/.git/objects/34/ (stored 0%)
  adding: Cats/.git/objects/34/a56a7bb8f532cc14a2cbc5f39cfe3bbd13b45b (stored 0%)
  adding: Cats/.git/objects/f1/ (stored 0%)
  adding: Cats/.git/objects/f1/d1b663d4cce1feedb5ce83b522391f203706f1 (stored 0%)
  adding: Cats/.git/objects/55/ (stored 0%)
  adding: Cats/.git/objects/55/d5ab3367a4d5543a6cc4b4bdd24243a943f048 (stored 0%)
  adding: Cats/.git/objects/2d/ (stored 0%)
  adding: Cats/.git/objects/2d/0db3290560d84500a7cbc143dee2b76478608f (stored 0%)
  adding: Cats/.git/objects/info/ (stored 0%)
  adding: Cats/.git/objects/a0/ (stored 0%)
  adding: Cats/.git/objects/a0/6cce4004965c0eb024f0ed0d803203bb90bd1a (stored 0%)
  adding: Cats/.git/objects/e5/ (stored 0%)
  adding: Cats/.git/objects/e5/63746be39747e727a683d4df77adc84bb78345 (stored 0%)
  adding: Cats/.git/HEAD (stored 0%)
  adding: Cats/.git/logs/ (stored 0%)
  adding: Cats/.git/logs/refs/ (stored 0%)
  adding: Cats/.git/logs/refs/heads/ (stored 0%)
  adding: Cats/.git/logs/refs/heads/main (deflated 54%)
  adding: Cats/.git/logs/refs/remotes/ (stored 0%)
  adding: Cats/.git/logs/refs/remotes/remote-alice/ (stored 0%)
  adding: Cats/.git/logs/refs/remotes/remote-alice/main (deflated 28%)
  adding: Cats/.git/logs/refs/remotes/origin/ (stored 0%)
  adding: Cats/.git/logs/refs/remotes/origin/main (deflated 49%)
  adding: Cats/.git/logs/HEAD (deflated 54%)
  adding: Cats/.git/config (deflated 44%)
  adding: Cats/.git/info/ (stored 0%)
  adding: Cats/.git/info/exclude (deflated 28%)
  adding: Cats/.git/index (deflated 20%)
  adding: Cats/CSS/ (stored 0%)
  adding: Cats/CSS/site.css (deflated 30%)
user_julnarot [ ~ ]$ download Cats.zip 

## Creating branch like alice

Requesting a Cloud Shell.Succeeded. 
Connecting terminal...

Welcome to Azure Cloud Shell

Type "az" to use Azure CLI
Type "help" to learn about Cloud Shell

user_julnarot [ ~ ]$ mkdir Shared.git
user_julnarot [ ~ ]$ cd Shared.git/
user_julnarot [ ~/Shared.git ]$ git init --bare
hint: Using 'master' as the name for the initial branch. This default branch name
hint: is subject to change. To configure the initial branch name to use in all
hint: of your new repositories, which will suppress this warning, call:
hint: 
hint:   git config --global init.defaultBranch <name>
hint: 
hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
hint: 'development'. The just-created branch can be renamed via this command:
hint: 
hint:   git branch -m <name>
Initialized empty Git repository in /home/user_julnarot/Shared.git/
user_julnarot [ ~/Shared.git ]$ git symbolic-ref HEAD refs/heads/main
user_julnarot [ ~/Shared.git ]$ cd
user_julnarot [ ~ ]$ mkdir Bob
user_julnarot [ ~ ]$ cd Bob/
user_julnarot [ ~/Bob ]$ git clone ../Shared.git .
Cloning into '.'...
warning: You appear to have cloned an empty repository.
done.
user_julnarot [ ~/Bob ]$ git config user.name Bob
user_julnarot [ ~/Bob ]$ git config user.email bob@contoso.com
user_julnarot [ ~/Bob ]$ git symbolic-ref HEAD refs/heads/main
user_julnarot [ ~/Bob ]$ touch index.html
user_julnarot [ ~/Bob ]$ mkdir Assets
user_julnarot [ ~/Bob ]$ touch Assets/site.css
user_julnarot [ ~/Bob ]$ git add .
user_julnarot [ ~/Bob ]$ git commit -m "Create empty index.html and site.css files"
[main (root-commit) 9e60ec4] Create empty index.html and site.css files
 2 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 Assets/site.css
 create mode 100644 index.html
user_julnarot [ ~/Bob ]$ vim index.html 
user_julnarot [ ~/Bob ]$ cd Assets/
user_julnarot [ ~/Bob/Assets ]$ vim site.css 
user_julnarot [ ~/Bob/Assets ]$ cd ..
user_julnarot [ ~/Bob ]$ git add .
user_julnarot [ ~/Bob ]$ git commit -m "Add siomple HTML and stylesheet"
[main 8d7bfc9] Add siomple HTML and stylesheet
 2 files changed, 17 insertions(+)
user_julnarot [ ~/Bob ]$ git push --set-upstream origin main
Enumerating objects: 9, done.
Counting objects: 100% (9/9), done.
Delta compression using up to 3 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (9/9), 956 bytes | 956.00 KiB/s, done.
Total 9 (delta 0), reused 0 (delta 0), pack-reused 0
To /home/user_julnarot/Bob/../Shared.git
 * [new branch]      main -> main
Branch 'main' set up to track remote branch 'main' from 'origin'.
user_julnarot [ ~/Bob ]$ cd
user_julnarot [ ~ ]$ mkdir Alice
user_julnarot [ ~ ]$ cd Alice/
user_julnarot [ ~/Alice ]$ ^[[200~git clone ../Shared.git .~^C
user_julnarot [ ~/Alice ]$ git clone ../Shared.git .
Cloning into '.'...
done.
user_julnarot [ ~/Alice ]$ git config user.name Alice
user_julnarot [ ~/Alice ]$ git config user.email alice@contoso.com
user_julnarot [ ~/Alice ]$ ls
Assets  index.html
user_julnarot [ ~/Alice ]$ git status
On branch main
Your branch is up to date with 'origin/main'.

nothing to commit, working tree clean
user_julnarot [ ~/Alice ]$ git branch add-style
user_julnarot [ ~/Alice ]$ git checkout add-style
Switched to branch 'add-style'
user_julnarot [ ~/Alice ]$ vim Assets/site.css 
user_julnarot [ ~/Alice ]$ git commit -a -m "Add style for cat pictures"
[add-style ad4dd49] Add style for cat pictures
 1 file changed, 1 insertion(+)
user_julnarot [ ~/Alice ]$ git checkout main
Switched to branch 'main'
Your branch is up to date with 'origin/main'.
user_julnarot [ ~/Alice ]$ git pull
Already up to date.
user_julnarot [ ~/Alice ]$ git merge --ff-only add-style
Updating 8d7bfc9..ad4dd49
Fast-forward
 Assets/site.css | 1 +
 1 file changed, 1 insertion(+)
user_julnarot [ ~/Alice ]$


## conflic resolver

user_julnarot [ ~/Alice ]$ cd
user_julnarot [ ~ ]$ cd Bob/
user_julnarot [ ~/Bob ]$ ls
Assets  index.html
user_julnarot [ ~/Bob ]$ git checkout -b add-cat
Switched to a new branch 'add-cat'
user_julnarot [ ~/Bob ]$ wget https://github.com/MicrosoftDocs/mslearn-branch-merge-git/raw/main/git-resources.zip
--2023-11-05 05:04:28--  https://github.com/MicrosoftDocs/mslearn-branch-merge-git/raw/main/git-resources.zip
Resolving github.com... 192.30.255.113
Connecting to github.com|192.30.255.113|:443... connected.
HTTP request sent, awaiting response... 302 Found
Location: https://raw.githubusercontent.com/MicrosoftDocs/mslearn-branch-merge-git/main/git-resources.zip [following]
--2023-11-05 05:04:28--  https://raw.githubusercontent.com/MicrosoftDocs/mslearn-branch-merge-git/main/git-resources.zip
Resolving raw.githubusercontent.com... 185.199.108.133, 185.199.109.133, 185.199.111.133, ...
Connecting to raw.githubusercontent.com|185.199.108.133|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 73597 (72K) [application/zip]
Saving to: ‘git-resources.zip’

git-resources.zip    100%[====================>]  71.87K  --.-KB/s    in 0.001s  

2023-11-05 05:04:28 (56.8 MB/s) - ‘git-resources.zip’ saved [73597/73597]

user_julnarot [ ~/Bob ]$ unzip git-resources.zip
Archive:  git-resources.zip
  inflating: bobcat2-317x240.jpg     
  inflating: bombay-cat-180x240.jpg  
user_julnarot [ ~/Bob ]$ mv bobcat2-317x240.jpg Assets/bobcat2-317x240.jpg
user_julnarot [ ~/Bob ]$ rm git-resources.zip
user_julnarot [ ~/Bob ]$ rm bombay-cat-180x240.jpg
user_julnarot [ ~/Bob ]$ vim index.html 
user_julnarot [ ~/Bob ]$ git status
On branch add-cat
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   index.html

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Assets/bobcat2-317x240.jpg

no changes added to commit (use "git add" and/or "git commit -a")
user_julnarot [ ~/Bob ]$ git add .
user_julnarot [ ~/Bob ]$ git commit -a -m "Add picture of Bob's cat"
[add-cat b5a1af2] Add picture of Bob's cat
 2 files changed, 1 insertion(+), 1 deletion(-)
 create mode 100644 Assets/bobcat2-317x240.jpg
user_julnarot [ ~/Bob ]$ git checkout main
Switched to branch 'main'
Your branch is up to date with 'origin/main'.
user_julnarot [ ~/Bob ]$ git pull
Already up to date.
user_julnarot [ ~/Bob ]$ git checkout main
Already on 'main'
Your branch is up to date with 'origin/main'.
user_julnarot [ ~/Bob ]$ git pull
Already up to date.
user_julnarot [ ~/Bob ]$ git merge add-cat --no-edit
Updating 8d7bfc9..b5a1af2
Fast-forward
 Assets/bobcat2-317x240.jpg | Bin 0 -> 31501 bytes
 index.html                 |   2 +-
 2 files changed, 1 insertion(+), 1 deletion(-)
 create mode 100644 Assets/bobcat2-317x240.jpg
user_julnarot [ ~/Bob ]$ git push
Enumerating objects: 8, done.
Counting objects: 100% (8/8), done.
Delta compression using up to 3 threads
Compressing objects: 100% (5/5), done.
Writing objects: 100% (5/5), 31.07 KiB | 15.53 MiB/s, done.
Total 5 (delta 1), reused 0 (delta 0), pack-reused 0
To /home/user_julnarot/Bob/../Shared.git
   8d7bfc9..b5a1af2  main -> main
user_julnarot [ ~/Bob ]$ ls
Assets  index.html
user_julnarot [ ~/Bob ]$ cd ../Alice/
user_julnarot [ ~/Alice ]$ git pull
remote: Enumerating objects: 8, done.
remote: Counting objects: 100% (8/8), done.
remote: Compressing objects: 100% (5/5), done.
remote: Total 5 (delta 1), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (5/5), 31.05 KiB | 15.52 MiB/s, done.
From /home/user_julnarot/Alice/../Shared
   8d7bfc9..b5a1af2  main       -> origin/main
hint: You have divergent branches and need to specify how to reconcile them.
hint: You can do so by running one of the following commands sometime before
hint: your next pull:
hint: 
hint:   git config pull.rebase false  # merge (the default strategy)
hint:   git config pull.rebase true   # rebase
hint:   git config pull.ff only       # fast-forward only
hint: 
hint: You can replace "git config" with "git config --global" to set a default
hint: preference for all repositories. You can also pass --rebase, --no-rebase,
hint: or --ff-only on the command line to override the configured default per
hint: invocation.
fatal: Need to specify how to reconcile divergent branches.
user_julnarot [ ~/Alice ]$ git status
On branch main
Your branch and 'origin/main' have diverged,
and have 1 and 1 different commits each, respectively.
  (use "git pull" to merge the remote branch into yours)

nothing to commit, working tree clean
user_julnarot [ ~/Alice ]$ git pull --force
hint: You have divergent branches and need to specify how to reconcile them.
hint: You can do so by running one of the following commands sometime before
hint: your next pull:
hint: 
hint:   git config pull.rebase false  # merge (the default strategy)
hint:   git config pull.rebase true   # rebase
hint:   git config pull.ff only       # fast-forward only
hint: 
hint: You can replace "git config" with "git config --global" to set a default
hint: preference for all repositories. You can also pass --rebase, --no-rebase,
hint: or --ff-only on the command line to override the configured default per
hint: invocation.
fatal: Need to specify how to reconcile divergent branches.
user_julnarot [ ~/Alice ]$ git branch
  add-style
* main
user_julnarot [ ~/Alice ]$ git checkout -b add-cat
Switched to a new branch 'add-cat'
user_julnarot [ ~/Alice ]$ cd ../Bob/
user_julnarot [ ~/Bob ]$ git^C
user_julnarot [ ~/Bob ]$ git checkout -b style-cat
Switched to a new branch 'style-cat'
user_julnarot [ ~/Bob ]$ cd ../Alice/
user_julnarot [ ~/Alice ]$ wget https://github.com/MicrosoftDocs/mslearn-branch-merge-git/raw/main/git-resources.zip
unzip git-resources.zip
--2023-11-05 05:12:22--  https://github.com/MicrosoftDocs/mslearn-branch-merge-git/raw/main/git-resources.zip
Resolving github.com... 192.30.255.112
Connecting to github.com|192.30.255.112|:443... connected.
HTTP request sent, awaiting response... 302 Found
Location: https://raw.githubusercontent.com/MicrosoftDocs/mslearn-branch-merge-git/main/git-resources.zip [following]
--2023-11-05 05:12:22--  https://raw.githubusercontent.com/MicrosoftDocs/mslearn-branch-merge-git/main/git-resources.zip
Resolving raw.githubusercontent.com... 185.199.108.133, 185.199.109.133, 185.199.110.133, ...
Connecting to raw.githubusercontent.com|185.199.108.133|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 73597 (72K) [application/zip]
Saving to: ‘git-resources.zip’

git-resources.zip    100%[====================>]  71.87K  --.-KB/s    in 0.002s  

2023-11-05 05:12:22 (40.3 MB/s) - ‘git-resources.zip’ saved [73597/73597]

Archive:  git-resources.zip
  inflating: bobcat2-317x240.jpg     
  inflating: bombay-cat-180x240.jpg  
user_julnarot [ ~/Alice ]$ mv bombay-cat-180x240.jpg Assets/bombay-cat-180x240.jpg
rm git-resources.zip
rm bobcat2-317x240.jpg
user_julnarot [ ~/Alice ]$ vim index.html 
user_julnarot [ ~/Alice ]$ git add Assets
git commit -a -m "Add picture of Alice's cat"
git checkout main
git pull
git merge --ff-only add-cat
git push
[add-cat 43a273c] Add picture of Alice's cat
 2 files changed, 1 insertion(+), 1 deletion(-)
 create mode 100644 Assets/bombay-cat-180x240.jpg
Switched to branch 'main'
Your branch and 'origin/main' have diverged,
and have 1 and 1 different commits each, respectively.
  (use "git pull" to merge the remote branch into yours)
hint: You have divergent branches and need to specify how to reconcile them.
hint: You can do so by running one of the following commands sometime before
hint: your next pull:
hint: 
hint:   git config pull.rebase false  # merge (the default strategy)
hint:   git config pull.rebase true   # rebase
hint:   git config pull.ff only       # fast-forward only
hint: 
hint: You can replace "git config" with "git config --global" to set a default
hint: preference for all repositories. You can also pass --rebase, --no-rebase,
hint: or --ff-only on the command line to override the configured default per
hint: invocation.
fatal: Need to specify how to reconcile divergent branches.
Updating ad4dd49..43a273c
Fast-forward
 Assets/bombay-cat-180x240.jpg | Bin 0 -> 45424 bytes
 index.html                    |   2 +-
 2 files changed, 1 insertion(+), 1 deletion(-)
 create mode 100644 Assets/bombay-cat-180x240.jpg
To /home/user_julnarot/Alice/../Shared.git
 ! [rejected]        main -> main (non-fast-forward)
error: failed to push some refs to '/home/user_julnarot/Alice/../Shared.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
user_julnarot [ ~/Alice ]$ git pull
hint: You have divergent branches and need to specify how to reconcile them.
hint: You can do so by running one of the following commands sometime before
hint: your next pull:
hint: 
hint:   git config pull.rebase false  # merge (the default strategy)
hint:   git config pull.rebase true   # rebase
hint:   git config pull.ff only       # fast-forward only
hint: 
hint: You can replace "git config" with "git config --global" to set a default
hint: preference for all repositories. You can also pass --rebase, --no-rebase,
hint: or --ff-only on the command line to override the configured default per
hint: invocation.
fatal: Need to specify how to reconcile divergent branches.
user_julnarot [ ~/Alice ]$ git pull --ff-only
fatal: Not possible to fast-forward, aborting.
user_julnarot [ ~/Alice ]$ git config --global pull.ff only
user_julnarot [ ~/Alice ]$ git pull
fatal: Not possible to fast-forward, aborting.
user_julnarot [ ~/Alice ]$ git config pull.ff only
user_julnarot [ ~/Alice ]$ git pull
fatal: Not possible to fast-forward, aborting.
user_julnarot [ ~/Alice ]$ git config pull.rebase fals
user_julnarot [ ~/Alice ]$ git pull
fatal: Invalid value for pull.rebase: fals
user_julnarot [ ~/Alice ]$ git config pull.rebase false
user_julnarot [ ~/Alice ]$ git pull
fatal: Not possible to fast-forward, aborting.
user_julnarot [ ~/Alice ]$ git config pull.rebase true
user_julnarot [ ~/Alice ]$ git pull
fatal: Not possible to fast-forward, aborting.
user_julnarot [ ~/Alice ]$ git config pull.ff only
user_julnarot [ ~/Alice ]$ git pull
fatal: Not possible to fast-forward, aborting.
user_julnarot [ ~/Alice ]$ git pull origin main --rebase
From /home/user_julnarot/Alice/../Shared
 * branch            main       -> FETCH_HEAD
Auto-merging index.html
CONFLICT (content): Merge conflict in index.html
error: could not apply 43a273c... Add picture of Alice's cat
Resolve all conflicts manually, mark them as resolved with
"git add/rm <conflicted_files>", then run "git rebase --continue".
You can instead skip this commit: run "git rebase --skip".
To abort and get back to the state before "git rebase", run "git rebase --abort".
Could not apply 43a273c... Add picture of Alice's cat
user_julnarot [ ~/Alice ]$ 
user_julnarot [ ~/Alice ]$ git status
interactive rebase in progress; onto b5a1af2
Last commands done (2 commands done):
   pick ad4dd49 Add style for cat pictures
   pick 43a273c Add picture of Alice's cat
No commands remaining.
You are currently rebasing branch 'main' on 'b5a1af2'.
  (fix conflicts and then run "git rebase --continue")
  (use "git rebase --skip" to skip this patch)
  (use "git rebase --abort" to check out the original branch)

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   Assets/bombay-cat-180x240.jpg

Unmerged paths:
  (use "git restore --staged <file>..." to unstage)
  (use "git add <file>..." to mark resolution)
        both modified:   index.html

user_julnarot [ ~/Alice ]$ vim index.html 
user_julnarot [ ~/Alice ]$ git add Assets
git commit -a -m "Add picture of Alice's cat"
git checkout main
git pull
git merge --ff-only add-cat
git push
[detached HEAD acbe8a7] Add picture of Alice's cat
 2 files changed, 1 insertion(+), 1 deletion(-)
 create mode 100644 Assets/bombay-cat-180x240.jpg
Warning: you are leaving 2 commits behind, not connected to
any of your branches:

  acbe8a7 Add picture of Alice's cat
  d923baf Add style for cat pictures

If you want to keep them by creating a new branch, this may be a good time
to do so with:

 git branch <new-branch-name> acbe8a7

Switched to branch 'main'
Your branch and 'origin/main' have diverged,
and have 2 and 1 different commits each, respectively.
  (use "git pull" to merge the remote branch into yours)
fatal: Not possible to fast-forward, aborting.
Already up to date.
To /home/user_julnarot/Alice/../Shared.git
 ! [rejected]        main -> main (non-fast-forward)
error: failed to push some refs to '/home/user_julnarot/Alice/../Shared.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
user_julnarot [ ~/Alice ]$ git pull
fatal: Not possible to fast-forward, aborting.
user_julnarot [ ~/Alice ]$ git pull
fatal: Not possible to fast-forward, aborting.
user_julnarot [ ~/Alice ]$ git merge --ff-only add-cat^C
user_julnarot [ ~/Alice ]$ git status
On branch main
Your branch and 'origin/main' have diverged,
and have 2 and 1 different commits each, respectively.
  (use "git pull" to merge the remote branch into yours)

Last commands done (2 commands done):
   pick ad4dd49 Add style for cat pictures
   pick 43a273c Add picture of Alice's cat
No commands remaining.
You are currently editing a commit while rebasing branch 'main' on 'b5a1af2'.
  (use "git commit --amend" to amend the current commit)
  (use "git rebase --continue" once you are satisfied with your changes)

nothing to commit, working tree clean
user_julnarot [ ~/Alice ]$ git rebase --continue
Successfully rebased and updated refs/heads/main.
user_julnarot [ ~/Alice ]$ git pull
fatal: Not possible to fast-forward, aborting.
user_julnarot [ ~/Alice ]$ git push
To /home/user_julnarot/Alice/../Shared.git
 ! [rejected]        main -> main (non-fast-forward)
error: failed to push some refs to '/home/user_julnarot/Alice/../Shared.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
user_julnarot [ ~/Alice ]$ git branch
  add-cat
  add-style
* main
user_julnarot [ ~/Alice ]$ git push
To /home/user_julnarot/Alice/../Shared.git
 ! [rejected]        main -> main (non-fast-forward)
error: failed to push some refs to '/home/user_julnarot/Alice/../Shared.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
user_julnarot [ ~/Alice ]$ git pull
fatal: Not possible to fast-forward, aborting.
user_julnarot [ ~/Alice ]$ git rebase --continue
fatal: No rebase in progress?
user_julnarot [ ~/Alice ]$ gits tat^C
user_julnarot [ ~/Alice ]$ git status
On branch main
Your branch and 'origin/main' have diverged,
and have 2 and 1 different commits each, respectively.
  (use "git pull" to merge the remote branch into yours)

nothing to commit, working tree clean
user_julnarot [ ~/Alice ]$ git pull
fatal: Not possible to fast-forward, aborting.
user_julnarot [ ~/Alice ]$ git push
To /home/user_julnarot/Alice/../Shared.git
 ! [rejected]        main -> main (non-fast-forward)
error: failed to push some refs to '/home/user_julnarot/Alice/../Shared.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
user_julnarot [ ~/Alice ]$ git status --all
error: unknown option `all'
usage: git status [<options>] [--] <pathspec>...

    -v, --verbose         be verbose
    -s, --short           show status concisely
    -b, --branch          show branch information
    --show-stash          show stash information
    --ahead-behind        compute full ahead/behind values
    --porcelain[=<version>]
                          machine-readable output
    --long                show status in long format (default)
    -z, --null            terminate entries with NUL
    -u, --untracked-files[=<mode>]
                          show untracked files, optional modes: all, normal, no. (Default: all)
    --ignored[=<mode>]    show ignored files, optional modes: traditional, matching, no. (Default: traditional)
    --ignore-submodules[=<when>]
                          ignore changes to submodules, optional when: all, dirty, untracked. (Default: all)
    --column[=<style>]    list untracked files in columns
    --no-renames          do not detect renames
    -M, --find-renames[=<n>]
                          detect renames, optionally set similarity index

user_julnarot [ ~/Alice ]$ git pull origin main
From /home/user_julnarot/Alice/../Shared
 * branch            main       -> FETCH_HEAD
fatal: Not possible to fast-forward, aborting.
user_julnarot [ ~/Alice ]$ git fetch
user_julnarot [ ~/Alice ]$ git status
On branch main
Your branch and 'origin/main' have diverged,
and have 2 and 1 different commits each, respectively.
  (use "git pull" to merge the remote branch into yours)

nothing to commit, working tree clean
user_julnarot [ ~/Alice ]$ git log
commit 43a273c79fda5451b0764baafdf16cbe806c742e (HEAD -> main, add-cat)
Author: Alice <alice@contoso.com>
Date:   Sun Nov 5 05:13:35 2023 +0000

    Add picture of Alice's cat

commit ad4dd49334b0ae529b1e4914f044214762c54c7f (add-style)
Author: Alice <alice@contoso.com>
Date:   Sun Nov 5 04:59:55 2023 +0000

    Add style for cat pictures

commit 8d7bfc99d01377a1bce9fb7b8f152a53b753f9f0
Author: Bob <bob@contoso.com>
Date:   Sun Nov 5 04:57:10 2023 +0000

    Add siomple HTML and stylesheet

commit 9e60ec42b02a824999eb128a11d99d8640f04719
Author: Bob <bob@contoso.com>
Date:   Sun Nov 5 04:55:36 2023 +0000

    Create empty index.html and site.css files
user_julnarot [ ~/Alice ]$ git checkout main
Already on 'main'
Your branch and 'origin/main' have diverged,
and have 2 and 1 different commits each, respectively.
  (use "git pull" to merge the remote branch into yours)
user_julnarot [ ~/Alice ]$ git pull
fatal: Not possible to fast-forward, aborting.
user_julnarot [ ~/Alice ]$ git pull --rebase origin main
From /home/user_julnarot/Alice/../Shared
 * branch            main       -> FETCH_HEAD
Auto-merging index.html
CONFLICT (content): Merge conflict in index.html
error: could not apply 43a273c... Add picture of Alice's cat
Resolve all conflicts manually, mark them as resolved with
"git add/rm <conflicted_files>", then run "git rebase --continue".
You can instead skip this commit: run "git rebase --skip".
To abort and get back to the state before "git rebase", run "git rebase --abort".
Could not apply 43a273c... Add picture of Alice's cat
user_julnarot [ ~/Alice ]$ vim index.html 
user_julnarot [ ~/Alice ]$ git add index.html 
user_julnarot [ ~/Alice ]$ git rebase --continue
[detached HEAD 516a7a0] Add picture of Alice's cat
 2 files changed, 1 insertion(+), 1 deletion(-)
 create mode 100644 Assets/bombay-cat-180x240.jpg
Successfully rebased and updated refs/heads/main.
user_julnarot [ ~/Alice ]$ git rebase --skip
fatal: No rebase in progress?
user_julnarot [ ~/Alice ]$ git push -f origin main
Enumerating objects: 13, done.
Counting objects: 100% (13/13), done.
Delta compression using up to 3 threads
Compressing objects: 100% (9/9), done.
Writing objects: 100% (9/9), 41.80 KiB | 10.45 MiB/s, done.
Total 9 (delta 3), reused 0 (delta 0), pack-reused 0
To /home/user_julnarot/Alice/../Shared.git
   b5a1af2..516a7a0  main -> main
user_julnarot [ ~/Alice ]$ cd ../Bob/
user_julnarot [ ~/Bob ]$ vim index.html 
user_julnarot [ ~/Bob ]$ git commit -a -m "Style Bob's cat"
git checkout main
git pull
git merge style-cat
[style-cat 0a85645] Style Bob's cat
 1 file changed, 1 insertion(+), 1 deletion(-)
Switched to branch 'main'
Your branch is up to date with 'origin/main'.
remote: Enumerating objects: 13, done.
remote: Counting objects: 100% (13/13), done.
remote: Compressing objects: 100% (9/9), done.
remote: Total 9 (delta 3), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (9/9), 41.78 KiB | 10.45 MiB/s, done.
From /home/user_julnarot/Bob/../Shared
   b5a1af2..516a7a0  main       -> origin/main
Updating b5a1af2..516a7a0
Fast-forward
 Assets/bombay-cat-180x240.jpg | Bin 0 -> 45424 bytes
 Assets/site.css               |   1 +
 index.html                    |   2 +-
 3 files changed, 2 insertions(+), 1 deletion(-)
 create mode 100644 Assets/bombay-cat-180x240.jpg
Auto-merging index.html
CONFLICT (content): Merge conflict in index.html
Automatic merge failed; fix conflicts and then commit the result.
user_julnarot [ ~/Bob ]$ vim index.html 
user_julnarot [ ~/Bob ]$ code index.html 
user_julnarot [ ~/Bob ]$ vim index.html 
user_julnarot [ ~/Bob ]$ git add index.html
git commit -a -m "Style Bob's cat"
[main 77904ff] Style Bob's cat
user_julnarot [ ~/Bob ]$ git push
Enumerating objects: 10, done.
Counting objects: 100% (10/10), done.
Delta compression using up to 3 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 625 bytes | 625.00 KiB/s, done.
Total 6 (delta 2), reused 0 (delta 0), pack-reused 0
To /home/user_julnarot/Bob/../Shared.git
   516a7a0..77904ff  main -> main
user_julnarot [ ~/Bob ]$ cd ../Alice
git pull
remote: Enumerating objects: 10, done.
remote: Counting objects: 100% (10/10), done.
remote: Compressing objects: 100% (6/6), done.
remote: Total 6 (delta 2), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (6/6), 605 bytes | 302.00 KiB/s, done.
From /home/user_julnarot/Alice/../Shared
   516a7a0..77904ff  main       -> origin/main
Updating 516a7a0..77904ff
Fast-forward
 index.html | 1 +
 1 file changed, 1 insertion(+)
user_julnarot [ ~/Alice ]$

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
