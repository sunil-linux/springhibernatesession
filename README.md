<pre>
1. Create/login to your GitHub Account.

2. Go to below link and 
   https://github.com/sunilkumargupta/springhibernatesession

3. Select the "fork" button.
   It will fork "springhibernatesession" repository to your account.

4. Follow the given git commands to work with your repository 
(Please note that "sunilkumargupta" my account so you have to replace it with your own in below commands).
	a. create your local git repository. 
		(e.g. d:\> mkdir github\sunil )   
	b. change directory to newly created one.
		(e.g. d:\> cd github\sunil)
	c. clone your Git repository.
		(e.g. d:\github\sunil> git clone https://github.com/sunilkumargupta/springhibernatesession)
	d. go to your repository.	
		(e.g. d:\github\sunil> cd springhibernatesession)
	e. List your repository.
		(e.g. d:\github\sunil\springhibernatesession> dir)
	f. Follow the tasks within your git repository or local repository.

5. we need to set proxy to work with our github account which I'll share offline.

6. Git commands:

1) Make the original repository upstream remote for your local

cd github\sunil
git clone https://github.com/&lt;user>/springhibernatesession
(&lt;user> is your account)
cd springhibernatesession

 ___________________________________________________________________________________________ 
|	One time setting:                                                                       |
|	cd springhibernatesession                                                               |
|	git remote add upstream https://github.com/sunilkumargupta/springhibernatesession       |
|___________________________________________________________________________________________|

To get updates from the source repository of sunilkumargupta
git fetch upstream
git merge upstream/master master
git push
	
</pre>
