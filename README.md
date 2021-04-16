# AndroidTrivia


This application focus on App Navigation:
Principles of navigation :

1. First principle : There's always a starting point.
2. Second Principle : You can always go back.
3. Third Principle : Up goes back (mostly)


Add dependency :


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

