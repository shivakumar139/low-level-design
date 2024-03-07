Strategy is a behavioural design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.



# Problem: 🤯

Imagine you are running an e-commerce store and you are accepting payment only in cash. But apparently, not everyone likes to pay in cash, so in the next update, you have added an option to pay with UPI. After that, you have added the option to pay with a debit card.

Later you have decided to add multiple options for payment like PayPal, credit card etc.



Each time you added a new payment algorithm, the main class of the Payment doubled in size. At some point, the beast became too hard to maintain.



Any change to one of the algorithms, whether it was a simple bug fix or a slight adjustment, affected the whole class, increasing the chance of creating an error in already-working code.



# Solution: 🥳

The Strategy pattern suggests that you take a class that does something specific in a lot of different ways and extract all of these algorithms into separate classes called strategies.



The original class, called Payment, must have a field for storing a reference to one of the strategies. The context delegates the work to a linked strategy object instead of executing it on its own.



In our application, we've organized payment methods into separate classes called strategies. Each strategy implements the PaymentStrategy interface. Now, the Payment class refers to this interface, allowing it to delegate payment processing to the appropriate strategy object. This approach keeps our code clean, flexible, and easy to maintain, ensuring a seamless payment experience for users. 🌟


