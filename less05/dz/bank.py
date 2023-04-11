class Bank:
    def __init__(self, users=[]):
        self.users = users

    def add_user(self, user):
        self.users.append(user)
        print(f"User {user.name} added")

    def delete_user(self, account_num):
        for user in self.users:
            if user.account_num == account_num:
                self.users.remove(user)
                print(f"User {user.name} removed")
                return
        print("User not found")

    def find_user(self, account_num):
        for user in self.users:
            if user.account_num == account_num:
                return user
        return None