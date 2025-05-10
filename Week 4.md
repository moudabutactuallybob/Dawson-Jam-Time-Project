# Week 4 Devlog
* Added all game phases in ```java Events.Game``` and ```java Events.Round```
* Implemented elements of user interface. (***Basically made the game look more pretty with colors and more ascii stuff >.<***)
* Printer class - tested more
* Changed some rules that either: **1.** Didn't make sense for the theme **OR 2.** Were way to hard to debug and I gave up. *speaking of debging...*
* DebugDebugDebugDebugDebugDebugDebugDebugDebugDebugDebug :(
## Here are some notable bugs that made me change my code significantly
1. NullPointerException when accessing the ```java Card``` at index ```i``` for the ```java Card[] cards``` field in ```java CardArray``` objects
  * Solution 1: Refactored cardArray entirely with a youtube tutorial and the help of a friend.
  * Solution 2: Called ```java Player.discardTable()``` after counting points instead of before due to points now being partly counted from table
2. Logical error in ```java Printer.printer``` class
  * Found a better solution to print hands line by line using ```java .split([regex])``` to create a String array in ```java Enumerations.Type```
3. Logical error when counting points
  * The program was adding cards to the ```java Table table``` field incorrectly: Either it was adding nothing and deleting the card from deck **OR** adding the same card over and over. ```java Table.placeCard()``` was simply broken but I refactored ```java Entities.Player``` **AND** ```java Entities.Table``` entirely before fixing this specific issue.
## Delivered the *FINAL* version of Jam Time
