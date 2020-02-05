# JavaFX Event Handling


## Gliederung
1. Einleitung 
2. Events
    1. Was sind Events?
    2. Wie werden Events ausgelöst?
    4. Welche Typen von Events gibt es?
    3. Wie behandle Events (Eventhandling)?
3. Properties & Binding 
    1. Was sind Properties?
    2. Was kann man mit Properties machen?
    3. Was ist ein Listener?
    3. Was ist Binding?
    4. Was ist High- und Low-Level Binding?
    5. Vor-/Nachteile
4. Beispiele
5. Fazit 


## 1. Einleitung 
## 2. Events
### Was sind Events?
Wie uns bereits bekannt ist kann man mit JavaFX grafische Oberflächen erstellen. Dieser Programm mit einer grafischen Oberfläche wäre mit der Interaktion des Benutzer sehr langweilig gestrickt. Ein Event in JavaFx ist jede Interaktion auf der grafischen Oberfläche welche aufgrund eines Ereignisses stattgefunden hat.
### Wie werden Events ausgelöst?
Ausgelöst werden Events in dem der Benutzer in irgendeiner Form mit der grafischen Oberfläche interagiert. Beispielsweise ein Mausklick, das Bewegen der Maus, das Eintippen eines Buchstaben auf der Tastatur o.ä..
### Welche Typen von Events gibt es?
Events werden unterteilt in Vordergrund Events (=engl. Foreground Events) und die sogenannten Hintergrund Events(=engl. Background Events). 
Die Vordergrund Events sind Ereignis die direkt aus der Interaktionen des Benutzers stammen. Die Hintergrund Events befassen sich mit Events die vom Endbenutzer ausgehen. Anders als Vordergrund Events ist der Endbenutzer der Computer selbst der Systemstörungen, Software Fehler oder ä.
### Beispiele für Event-Arten:
* Mouse Event 
* Key Event
* Drag Event
* Window Event
### Wie behandelt man Events (Eventhandling)?
Im Allgemeinen betrachtet ist das behandeln von Events nichts anders als das systematischen kontrollieren von Ereignis auf der JavaFx Oberfläche.
Diese Mechanismen werden je nach Ereignis ausgelöst und in freigegeben. 
In JavaFx besitzt jedes Event:
    * Ziel(Target): Die Node wohin das Event weitergeleitet wird
    * Quelle(Source):Die Node, welche das Event ausgelöst hat
    * Typ(Type): Der Typ des Events

Wichtig beim Eventhandling ist zu wissen, dass es eine sogennante Event-Verabeitungskette gibt(Event Dispathc chain) gibt.
Diese Kette ist in zwei Phasen eingeteilt: Event Capturing Phase und Event Bubbling Phase.

Die Event Capturing Phase ist die Phase in der das Event, die Ereigniss Verarbeitungskette von oben nach unten abläuft. Hierbei können bis hin zum Ziel
alle Nodes das Eventfilter und es filtern, sodass es nicht mehr am Ziel am kommt.

In der Event Bubbling Phase steigt das Event von unten nach oben und man kann mit dem Event arbeiten d.h. unterschiedliche Aktion ausführen.
    
 

## Properties & Binding

### Was sind Properties?
### Was kann man mit Properties machen?
### Was ist ein Listener?
### Was ist Binding?
### Was ist High- und Low-Level Binding?
### Vor-/Nachteile

## Beispiele
1. Basic Beispiel ohne GUI
2. Gleiches Beispiel mit GUI
3. Komplexes Beispiel

##Fazit 


## Links
1. [PDF](https://platform.itslearning.com/PdfViewer/Init.aspx?FileInfoUrl=https%3a%2f%2ffilerepository.itslearning.com%2ff8e84852-22ff-47f9-9215-7070252834d8%3fToken%3dS-oNAOcJAABrbCleAAAAACAAJ8ehLDGC5tOHI5uAP82BMV1EmJctVlYm5gC5I_BBJeIAAA%26Info%3d1&Language=de-DE)
2. [Präsentationslink](https://docs.google.com/presentation/d/1P2rKG4pHSC241VDOL-9OOKyJ3kglaXL6R29qHYVwA7s/edit?usp=sharing)
3. Quellen
<pre>
1.[https://www.tutorialspoint.com/javafx/javafx_event_handling.htm]
2.[]
3.[]
4.[]
</pre>


