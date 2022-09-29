CS4800 Projects
=========================

The site to showcase all the CS4800 student projects. We will keep this site maintained permanently, so make sure that you have a nice and professional team page here!


Git Exercise 1 - Add Your Personal Info in the Homepage
=======================================================

For this exercise, please add an HTML table row in the `teams-fall2022/index.html` web page by following the same format.

Once done, please check in your code and push to our Git repository. To push the changes, the command you will be using are:

```
git add <file>
git commit 
git push
```

When you try to execute ```git push```, you might see error messages about pulling the latest version, which means that someone else has recently pushed new changes and you need to sync up the code from the repo and make sure you have the latest version. In this case, you need to sync up the code with the following command:

```
git pull --rebase
```

If this is executed correctly, you can then push your code again with:

```
git push
```

However, in this exercise, it is very likely that you will see code conflicts when trying to check in your code. If that happens, you need to carefully resolve the conflicts. The basic steps to resolve conflicts are:

1. Use ```git status``` to check the status of your code and know exactly which file contains the code
2. Go to the file with conflicts and carefully clean it up - DON'T mess up others' changes - BE RESPONSIBLE
3. After cleaning up the file, you need to use ```git add <file>``` to tell Git that you have done resolving 
4. Use the command ```git rebase --continue``` to finish up the conflict resolving
5. You still need to do ```git push``` to finish the code check in

If you can successfully push your code, go to `https://github.com/cs480-projects/cs480-projects.github.io` to verify if your code is there and if you can see your commit message. 

Also, your change will appear in our project site: `http://cs480-projects.github.io`

And our class page is at: `http://cs480-projects.github.io/teams-fall2022/index.html`

Exercise 2 - Add Your Team Page
===============================

Each team should add a simple team page in `teams-fall2022/` folder and link it from the `teams-fall2022/index.html` page.

Note: make sure that you create a folder for your team. You should NOT modify or change other teams' folders. 

You don't have to spend a lot of effort to make the page pretty, but everyone in the team should contribute a little bit to this page.

Once done, you still need to push the code with the same set of instructions.

If everything works, you should be able to see the changes in the project website `http://cs480-projects.github.io`

Again, our class page is at: `http://cs480-projects.github.io/teams-fall2022/index.html`

