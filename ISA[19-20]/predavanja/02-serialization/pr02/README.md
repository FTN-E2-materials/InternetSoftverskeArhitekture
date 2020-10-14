# Serijalizacija: Protocol Buffers

Ovaj primer ilustruje mogućnosti prilikom serijalizacije objekata pomoću
Protocol Buffers formata.

## Potrebne stvari

* [Gradle](https://gradle.org)
* [Protocol Buffers Compiler](https://github.com/protocolbuffers/protobuf)

## Korisne stvari

* [Eclipse](https://www.eclipse.org)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/)
* [Postman](https://www.getpostman.com)

## Priprema primera

Ako se koristi neko od razvojnih okruženja, projekat se može pripremiti za
njih pomoću komande

`gradle eclipse`

ili 

`gradle idea`

Nakon toga se projekat može otvoriti u izabranom alatu i podešavanja za
projekat će već biti inicijalizovana.

## Pokretanje primera

Iz osnovnog foldera pokrenuti

`gradle run`

U Postmanu poslati sledeće GET zahteve:

 * Protobuf serijalizacija
   * Podaci o jednom studentu
     http://localhost:4567/api/studenti/E1234
   * Podaci o svim studentima
     http://localhost:4567/api/studenti
   * Podaci o jednoj oceni
     http://localhost:4567/api/ocene/1

