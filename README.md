# AndroidTrivia


This application focus on App Navigation:
Principles of navigation :

1. First principle : There's always a starting point.
2. Second Principle : You can always go back.
3. Third Principle : Up goes back (mostly)


Add dependency :
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-17%2000-32-48.png)
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-17%2000-32-52.png)


Now lets create Navigation as following-
Create new android resource file and select navigation
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-14%2017-23-24.png)
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-14%2017-27-03.png)


Now add the NavHostFragment to control the navigation as follows
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-15%2022-16-02.png)

Configure navigation file as follows
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-15%2022-26-28.png)

Now Add destination from tittle fragment to game fragment as follows
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-16%2023-23-55.png)

If you run your app now . You will see nothing changed . Actually we did not specified which button should launch the game fragment.
Now lets create the onClickListener for play button to trigger the GameFragment.
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-16%2023-55-08.png)

If you wondered where is the "action_fragmentTittle_to_gameFragment" id comes from. its inside your Navigation.
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-16%2023-55-19.png)

Now Run the app and see the play button is working . Yeah !!!

Now lets do it more nice way . When i added dependencies i added kotlin specific Navigation version which is part of jetpack project known as anroidKtx
which includes extensive function which makes android code more compact within kotlin. see Bellow
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-17%2000-11-38.png)

Navigation actually can create an onClick function for us . so lets remove the anonymous method as follows
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-17%2000-20-40.png)

And That's It.


### Conditional Navigation

Lets create two more fragment and add them in the navigation as follows
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-17%2000-52-23.png)

Actually The fragment has two button those launched the Game Over or Game Won Fragment
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-17%2001-11-39.png)

If game won or game is over there is not point to going back to game fragment on back pressed . Instead we should go back
to the tittle page . And if want to do that we need to access the back stack of navigation. We have to add an action to the
game fragment pop to with inclusive flag for both Game Won or Game Over fragment. In that case When we back pressed from
game Won fragment or game over fragment it will take to the fragment tittle not the previous game fragment.
Lets do it as follows.

Double click on previously created action in the navigation design panel. and do the following for both action.
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-17%2015-40-30.png)

Now Lets add a button to the game Over fragment for try again . it should take back to the game fragment for retry .
When we restart the game we need to pop off game won and game over fragment. So we need to add another action in game Over
fragment in this time we are going to pop to fragmentTittle and not inclusive. because we are going to restart the game from
tittleFragment. So lets do it with out the inclusive flag.
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-17%2018-05-35.png)
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-17%2018-14-50.png)


### Adding Up button on the app bar
Navigation Controller has a Ui Library called Navigation Ui among other things . To hook up the up button Navigation Ui needs
access to the navigation controller. So in your activity find the NavController and add it with the Ui Library as follows.