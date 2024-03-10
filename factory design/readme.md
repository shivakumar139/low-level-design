
Factory Design pattern is a creational design pattern that lets you isolate the object creation from the user.


# Problem 🤯
The problem arises when we need to provide users with the ability to create various types of documents (e.g., PDF, Word, HTML) without exposing the details of how these documents are created. Exposing the creation process directly to users can lead to tight coupling between the client code and the document creation logic. Additionally, if the document creation process changes in the future, it would require modifications in multiple places throughout the codebase, which can be error-prone and difficult to maintain.

# Solution 🥳
To address this problem, we can apply the Factory Design Pattern. By implementing this pattern, we can encapsulate the document creation process within a com.factory class. This com.factory class provides methods for creating different types of documents, abstracting away the complex object instantiation logic from the users. Users can simply request the creation of a document through the com.factory without needing to know the specific implementation details. This not only simplifies the client code but also ensures flexibility and maintainability by centralizing the creation logic within the com.factory.


