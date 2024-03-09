
Decorator is a structural design pattern that lets you attach new behaviours to objects by placing these objects inside special wrapper objects that contain the behaviours.



# Problem 🤯
Imagine that you’re working on a notification library that lets other programs notify their users about important events. Initially, you have only added to send notifications through Email. At some point, you realize that users of the library expect more than just email notifications. Many of them would like to receive an SMS about critical issues. Others would like to be notified on Facebook and, of course, the corporate users would love to get Slack notifications.

It is not hard. you just extend the base Notifier class and put the additional notification methods into new subclasses.
But the problem arises when users want the notification in SMS and WhatsApp, some want in Facebook and Slack and others want it in WhatsApp and Slack. You tried to address that problem by creating special subclasses that combined several notification methods within one class.

There are many combinations of it. This approach will increase the size of your library code.

You have to find another approach so that your code size won't accidentally break some Guinness record.😂

# Solution 🥳
The solution to this problem lies in leveraging the Decorator design pattern. Instead of creating numerous subclasses to handle various combinations of notification methods, we can utilize decorators to dynamically attach additional behaviors or notification methods to the base notifier class.

It is more look like this EmailNotifier(SMSNotifier(WhatsAppNotifier(SlackNotifier(Notifier()))))
