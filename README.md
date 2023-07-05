# ExempleStrategy1251

```mermaid

classDiagram
direction BT
class AggressifBehaviour {
  + AggressifBehaviour() 
  + moveCommand() int
}
class DefensifBehaviour {
  + DefensifBehaviour() 
  + moveCommand() int
}
class IBehaviour {
<<Interface>>
  + moveCommand() int
}
class Main {
  + Main() 
  + main(String[]) void
}
class NormalBehaviour {
  + NormalBehaviour() 
  + moveCommand() int
}
class Robot {
  + Robot(String, IBehaviour) 
  + Robot(Robot) 
  + Robot(String) 
  + Robot() 
  - IBehaviour behaviour
  - String nom
  + move() void
  + toString() String
   String nom
   IBehaviour behaviour
}

AggressifBehaviour  ..>  IBehaviour 
DefensifBehaviour  ..>  IBehaviour 
Main  ..>  AggressifBehaviour : «create»
Main  ..>  DefensifBehaviour : «create»
Main  ..>  NormalBehaviour : «create»
Main  ..>  Robot : «create»
NormalBehaviour  ..>  IBehaviour 
Robot "1" *--> "behaviour 1" IBehaviour 

