## Функціональність програми:

- Програма повинна перевіряти, чи дане слово є паліндромом.
- Словом вважається послідовність символів, розділених пробілами.
- При перевірці слова не враховується регістр символів.

## Опис роботи:

- Програма реалізована на Java.
- Для перевірки регістру символів використовується метод toLowerCase().
- Для видалення пробілів використовується метод replaceAll().
- Для порівняння символів використовується оператор equals().

## API:

Метод isPalindrome() приймає одне слово в якості аргументу і повертає true, якщо слово є паліндромом, і false в іншому випадку.

## Тестування:

Для тестування програми використовується фреймворк JUnit 5.
Написані тести перевіряють, чи функція правильно визначає, чи є слово паліндромом.