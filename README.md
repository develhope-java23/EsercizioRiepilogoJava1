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

Definire un nuovo tipo di runtime exception, InvalidProductParameterException, e lanciarla includendo un messaggio d'errore quando uno di questi vincoli viene violato. 

- Aggiungere un metodo getTotalPrice che ritorna il prezzo totale del prodotto, moltiplicando la quantità per il prezzo unitario.

- Scrivere degli unit test per la classe

## Parte 2
- Implementare una classe Cart, che rappresenta un carrello per un'ordine da effettuare. Un carrello è definito da una lista di prodotti, inizialmente vuota, in cui è possibile aggiungere e rimuovere prodotti. Ogni carrello ha, inoltre, una capienza massima.
- Definire nella classe un metodo addProduct(...) che permette di aggiungere un nuovo oggetto Product al carrello. Se un Product con lo stesso nome è già presente nel carrello, Nel caso in cui la capienza del carrello venga superata dall'aggiunta dell'oggetto, l'inserimento è annullato e viene lanciata un'eccezione di un nuovo tipo OutOfCartCapacityException.
- Definire nella classe un metodo removeProductsByName(...) che permette la rimozione di tutti i prodotti con quel nome dal carrello.
- Definire nella classe un metodo removeProductsWithHigherPrice(...) che permette la rimozione di tutti i prodotti con costo totale maggiore di un dato valore.
- Aggiungere alla classe un metodo getTotalPrice(...) che ritorna il prezzo totale del carrello.
- Scrivere degli unit test per la classe


