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

If you wondered where is the "action_fragmentTittle_to_gameFragment" id comes from. its inside your Navigation.
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-16%2023-55-19.png)

Now Run the app and see the play button is working . Yeah !!!

Now lets do it more nice way . When i added dependencies i added kotlin specific Navigation version which is part of jetpack project known as anroidKtx
which includes extensive function which makes android code more compact within kotlin. see Bellow
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-17%2000-11-38.png)

Navigation actually create an onClick function for us . so lets remove the anonymous method as follows
![](https://github.com/Apurba000Biswas/AndroidTrivia/blob/master/screen_shots/Screenshot%20from%202021-04-17%2000-20-40.png)

