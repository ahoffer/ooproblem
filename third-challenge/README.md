### Third Challenge

#### Background
Yubia and Tupra trade both goods and services. One of the most commonly purchased services is
magic. Yubrian wizards and Tupran sorcerers perform acts of magic for hire. The nature of 
their magic is very different and is measured differently. 

- Yubia's wizards measure magic in _Fantasms_
- Trupa's sorcerers measure magic in _Thaums_

The Draule Empire does not use either metrics. The mages of Draule measure magic in 
_Miraculos_

Note that Fantasms can be measured in real numbers. 1.001 is a valid number of Fantasms. However,
Thaums and Miraculos are always even numbers. Standard rounding rules are used when needed.

No easy conversion exists between the systems. There are some scholarly attempts to 
derive empirical formulas based on relative exertion, scope of magical effect, and its 
duration. The nature of these conversions is strange and arcane, as is magic itself.

Most academics accept these definitions within the empire:

- 1 Miraculo is roughly equal to `f^2 - 5*f + 12/f`, where **f** is the number of Fantasms  **<NOTE: replace with periodic function>**
- If the number of Thaums is even, then 
  - 1 Miraculo is about `(|sin(t)| + 0.5) * t^3` there **t** is the number of Thaums 
- If the number of Thaums is odd, then 
  -1  Miraculo is about `(|cos(t)| + 0.5) * t^3` there **t** is the number of Thaums
  
 
 
#### Challenge
A traveler from Yubia enters the sorcerers' guild in a Tupran city.  He want hire a sorcerer to 
 perform about about 0.75 Fantasm of magic. How many Thaums of magic is that? 
 Create an object-oriented solution.

#### Details
You are provided with an enumeration and a class in this directory:
`thrid-challenge/src/main/java/challenge`

- You may change the class or add new files. 
 
You are also provided a JUnit test case to run to check your solution in this directory:
`third-challenge/src/test/java/challenge`
