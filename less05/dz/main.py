# /**
#  * Реализовать систему работы банковского приложения.
#  * - Создать класс пользователь и  соответсвующие классы
#  * - Реализовать операции зачисления средств пользователю на счет и списания(У пользователя должно быть отдельное поле - его балланс)
#  * - Реализовать функции добавления и удаления пользователя
#  */
from OOP.untitled.src.GB_OOPnaJAVA.less05.dz.bank import Bank
from OOP.untitled.src.GB_OOPnaJAVA.less05.dz.user import User

# Создание пользователей
user1 = User("John", "1234", 1000)
user2 = User("Sarah", "5678", 500)

# Создание банка
bank = Bank()

# Добавление пользователей в банк
bank.add_user(user1)
bank.add_user(user2)

# Нахождение и отображение баланса пользователя
user = bank.find_user("1234")
if user:
    user.display_balance()

# Зачисление и списание средств
user1.deposit(500)
user1.withdraw(200)

# Удаление пользователя из банка
bank.delete_user("5678")