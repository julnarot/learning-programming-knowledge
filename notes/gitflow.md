## check releases

``` bash
git tag
```

example:
``` bash
❯ git tag
0.1.0 <-- last tag
0.1.1
login-validate
sign-up
v0.0.1
v0.0.2
v0.0.3
```


## Release

creating release
``` bash
git flow release start 0.1.0
```
``` bash
❯ git flow release start 0.1.0
Branches 'development' and 'origin/development' have diverged.
And local branch 'development' is ahead of 'origin/development'.
Switched to a new branch 'release/0.1.0'

Summary of actions:
- A new branch 'release/0.1.0' was created, based on 'development'
- You are now on branch 'release/0.1.0'

Follow-up actions:
- Bump the version number now!
- Start committing last-minute fixes in preparing your release
- When done, run:

     git flow release finish '0.1.0'
```

publish release
``` bash
git flow release publish  0.1.0
```
``` bash

❯ git flow release publish  0.1.0
Enumerating objects: 175, done.
Counting objects: 100% (175/175), done.
Delta compression using up to 8 threads
Compressing objects: 100% (107/107), done.
Writing objects: 100% (149/149), 15.29 KiB | 921.00 KiB/s, done.
Total 149 (delta 51), reused 0 (delta 0)
remote: Resolving deltas: 100% (51/51), completed with 16 local objects.
remote: 
remote: Create a pull request for 'release/0.1.0' on GitHub by visiting:
remote:      https://github.com/julnarot/my-repo-demo/pull/new/release/0.1.0
remote: 
To https://github.com/julnarot/my-repo-demo.git
 * [new branch]      release/0.1.0 -> release/0.1.0
Branch 'release/0.1.0' set up to track remote branch 'release/0.1.0' from 'origin'.
Already on 'release/0.1.0'
Your branch is up to date with 'origin/release/0.1.0'.

Summary of actions:
- The remote branch 'release/0.1.0' was created or updated
- The local branch 'release/0.1.0' was configured to track the remote branch
- You are now on branch 'release/0.1.0'
```
finish release
``` bash
git flow release finish  0.1.0
```
``` bash

❯ git flow release finish  0.1.0
Branches 'development' and 'origin/development' have diverged.
And local branch 'development' is ahead of 'origin/development'.
Switched to branch 'main'
Your branch is up to date with 'origin/main'.
Removing src/main/java/com/julkedam/sgsc_api/container/Location.java
Removing src/main/java/com/julkedam/sgsc_api/container/ContainerRepository.java
Removing src/main/java/com/julkedam/sgsc_api/container/ContainerController.java
Removing src/main/java/com/julkedam/sgsc_api/container/Container.java
Merge made by the 'recursive' strategy.
 .../java/com/julkedam/sgsc_api/SecurityConfiguration.java    |   4 +-
 src/main/java/com/julkedam/sgsc_api/SgscConfig.java          | 113 +--------------------------
 src/main/java/com/julkedam/sgsc_api/auth/RoleEnum.java       |   2 +-
 src/main/java/com/julkedam/sgsc_api/auth/User.java           |   8 ++
 .../java/com/julkedam/sgsc_api/auth/UsersRepository.java     |   7 ++
 src/main/java/com/julkedam/sgsc_api/campaign/Campaign.java   |  12 ++-
 .../com/julkedam/sgsc_api/campaign/CampaignController.java   |  24 +++---
 .../com/julkedam/sgsc_api/campaign/CampaignRepository.java   |  17 ++--
 src/main/java/com/julkedam/sgsc_api/container/Container.java |  44 -----------
 .../com/julkedam/sgsc_api/container/ContainerController.java |  59 --------------
 .../com/julkedam/sgsc_api/container/ContainerRepository.java |  13 ---
 src/main/java/com/julkedam/sgsc_api/container/Location.java  |  24 ------
 src/main/java/com/julkedam/sgsc_api/customer/Customer.java   |  21 +++--
 .../com/julkedam/sgsc_api/customer/CustomerController.java   |  16 +++-
 .../customer_campaign/CustomerCampaignController.java        |   2 +-
 .../customer_campaign/CustomerCampaignRepository.java        |   3 +-
 .../customer_followup/CustomerFollowupRepository.java        |   3 +-
 .../java/com/julkedam/sgsc_api/enterprise/Enterprise.java    |   5 +-
 .../julkedam/sgsc_api/enterprise/EnterpriseController.java   |  45 +++++++++++
 src/main/java/com/julkedam/sgsc_api/enums/Financing.java     |   2 +-
 src/main/java/com/julkedam/sgsc_api/user/UserController.java |  53 +++++++++++++
 src/main/resources/application copy_yml                      |  14 ++++
 22 files changed, 206 insertions(+), 285 deletions(-)
 delete mode 100644 src/main/java/com/julkedam/sgsc_api/container/Container.java
 delete mode 100644 src/main/java/com/julkedam/sgsc_api/container/ContainerController.java
 delete mode 100644 src/main/java/com/julkedam/sgsc_api/container/ContainerRepository.java
 delete mode 100644 src/main/java/com/julkedam/sgsc_api/container/Location.java
 create mode 100644 src/main/java/com/julkedam/sgsc_api/enterprise/EnterpriseController.java
 create mode 100644 src/main/java/com/julkedam/sgsc_api/user/UserController.java
Already on 'main'
Your branch is ahead of 'origin/main' by 17 commits.
  (use "git push" to publish your local commits)
Switched to branch 'development'
Already up to date!
Merge made by the 'recursive' strategy.
To https://github.com/julnarot/my-repo-demo.git
 - [deleted]         release/0.1.0
Deleted branch release/0.1.0 (was e38d3ff).

Summary of actions:
- Release branch 'release/0.1.0' has been merged into 'main'
- The release was tagged '0.1.0'
- Release tag '0.1.0' has been back-merged into 'development'
- Release branch 'release/0.1.0' has been locally deleted; it has been remotely deleted from 'origin'
- You are now on branch 'development'
```
public tags
``` bash
git push origin --tags
```
``` bash

❯ git push origin --tags
Enumerating objects: 179, done.
Counting objects: 100% (179/179), done.
Delta compression using up to 8 threads
Compressing objects: 100% (111/111), done.
Writing objects: 100% (153/153), 16.07 KiB | 685.00 KiB/s, done.
Total 153 (delta 50), reused 0 (delta 0)
remote: Resolving deltas: 100% (50/50), completed with 16 local objects.
To https://github.com/julnarot/my-repo-demo.git
 * [new tag]         0.0.152 -> 0.0.152
 * [new tag]         0.0.155 -> 0.0.155
 * [new tag]         0.1.0 -> 0.1.0
```
merge and public to remote
``` bash
git checkout main
```
``` bash
git merge development
```
``` bash
git push origin main
```
Example:

``` bash

❯ git checkout main
Switched to branch 'main'
Your branch is ahead of 'origin/main' by 17 commits.
  (use "git push" to publish your local commits)
❯ git merge development
Updating 68f69fa..58ea8e7
Fast-forward
❯ git push origin main
Enumerating objects: 1, done.
Counting objects: 100% (1/1), done.
Writing objects: 100% (1/1), 239 bytes | 239.00 KiB/s, done.
Total 1 (delta 0), reused 0 (delta 0)
To https://github.com/julnarot/my-repo-demo.git
   703bcd8..58ea8e7  main -> main
```