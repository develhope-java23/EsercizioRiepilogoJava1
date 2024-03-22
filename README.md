# Esercizio di riepilogo Java \#1

## Parte 1
- Implementare una classe Product definita dai seguenti attributi:
  - name: String
  - unitPrice: double
  - quantity: int

- I seguenti vincoli vanno implementati quando si modificano i valori delle variabili d'istanza nel costruttore e nei setter:
  - La stringa "name" non può essere vuota
  - Il valore di quantity dev'essere maggiore di 0
  - Il valore di unitPrice dev'essere maggiore di 0.0

- Definire un nuovo tipo di runtime exception, InvalidProductParameterException, e lanciarla includendo un messaggio d'errore quando uno di questi vincoli viene violato. 

- Aggiungere un metodo getTotalPrice che ritorna il prezzo totale del prodotto, moltiplicando la quantità per il prezzo unitario.

- Scrivere degli unit test per la classe



