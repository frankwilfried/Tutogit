package paarezusammen;

import java.time.LocalTime;

public class Terminserie extends Termin {
private  String name ;
 private int interval;
 Termin termines[];


 public Terminserie(String name, LocalTime start, LocalTime ende) {
  super(name, start, ende );
  this.interval= interval;

 }
 public Termin getTermines (int index ){
  System.out.println ( "enter index" );

  int index = scanner.nextInt();
  return termines[index];
 }
 public int getAnzahl (){
  return termines.length;

 }
}
