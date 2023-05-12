# e-story
Du sollst einen neuen Online Store „Golden Syntax“ mitentwickeln


Grundlagen der Programmierung
Abschlussaufgabe
Hinweis: Lies die Aufgabe aufmerksam. Versuche vor Beginn, die Aufgabe zu strukturieren. Notiere
dir skizzenartig, was dein Programm braucht und setze deinen Plan Schritt für Schritt um.

1. Szenario
   Du bist neuerdings App-Developer und bekommst deinen ersten Auftrag: Du sollst einen neuen
   Online Store „Golden Syntax“ mitentwickeln. Bei diesem Laden handelt es sich um einen Online
   Vertrieb von verschiedenen Produkten. In deinem Developer-Team wird dir die Aufgabe zugeteilt,
   die Funktionalität des Shops zu entwickeln. Um die Datenbank kümmert sich ein anderes Team.
   Danach sollst du ein Accountmanagementsystem erschaffen, sodass sich der Ladenbetreiber und
   die Kunden in ihr Profil einloggen können.
   Welche Produkte in deinem Store zum Verkauf stehen, kannst du selbst entscheiden.</br></br>

2. Details
   Erstelle ein neues Projekt in IntelliJ. Es gibt eine Datei main.kt, in welcher der Onlinestore abläuft. Alle
   Klassen, die du erstellst, erhalten jeweils eine eigene Datei. Funktionen kannst du zusammen in eine
   Datei verlagern.
   Informationen zu den Produkten:</br>
   ● Es gibt mindestens zwei Kategorien von Produkten, mit jeweils mindestens zwei
   Unterkategorien. Jedes Produkt sollte mindestens einen Namen, einen Preis und eine
   Kundenrezension besitzen.
   Beispiele für Kategorien:
   Modeartikel, Elektronikartikel, Filme, Bücher, etc..</br>
   ● Die Unterkategorien müssen sich sinnvoll von den anderen unterscheiden. D.h. explizit, dass
   sie mindestens eine einzigartige Eigenschaft oder Fähigkeit besitzen.
   Beispiele für Unterkategorien:
   Mode: T-Shirts, Jacken, Schuhe

Elektronikartikel: Fernseher, Drucker, Konsole
Bücher: Roman, Lehrbuch, Atlas</br>
● Überlege dir eine sinnvolle Struktur, um deine Produkte im Store speichern und bearbeiten
zu können.
Informationen zu den Accounts:</br>
● Es gibt 2 Arten von Accounts: Betreiber-Accounts und Kunden-Accounts.
Beide Arten von Accounts sollten mithilfe eines Passworts geschützt werden, das beim
Einloggen korrekt eingegeben werden muss.</br>
● Die Kunden-Accounts sollten mit Hilfe der Konsole erstellt werden können.
Jedes Kundenkonto sollte zumindest eine Zahlungsmethode abspeichern und einen
Warenkorb speichern können. Diese Klasse sollte es ermöglichen, den aktuellen
Gesamtpreis des Warenkorbs schnell einzusehen. Kunden-Accounts sollen außerdem die
Möglichkeit besitzen, ein Produkt zu bewerten.</br>
● Die Betreiber-Accounts sollten mit Hilfe der Konsole Produkte hinzufügen, löschen und
nachbestellen können.</br></br>
Funktionalitäten des Stores:</br>
● Der Store sollte bereits mit einem guten Sortiment initialisiert werden, sodass man schnell
auf die wichtigsten Objekte (Accounts und Produkte) zugreifen kann.</br>
● Der Store hat eine Altersbegrenzung. Nur User mit einem Mindestalter von 12 Jahren haben
Zugang zu den Funktionalitäten des Stores. </br>
● Der Store besitzt einige print-Methoden, die nützliche Ansichten auf die Produkte auf der
Konsole ausdrucken können.</br>
● Implementiere mindestens zwei sortierte Ansichten auf die Produkte (z.B. nach Preis,
alphabetisch, etc.).</br>
● Implementiere mindestens zwei gefilterte Ansichten auf die Produkte (z.B. nach
Unterkategorie).</br>
● Der Store erlaubt es Kunden, Produkte zu ihrem Warenkorb hinzuzufügen und zeigt den
Gesamtpreis an.

3. Optionale, freiwillige Ergänzungen und Anmerkungen
   Selbstverständlich darfst du deinen Store mit deinen eigenen Ideen weiter ausschmücken.
   Einige Ideen zur Erweiterung:</br>
   ● Gutscheincodes</br>
   ● Sonderangebote (z.B. “Kauf 3, zahl 2”)</br>
   ● Empfehlung von ähnlichen Produkten