1. The public accessor method modifies the private data, adjusts the internal state of the model, and calls its setChanged()
method to indicate that its state has changed. It then calls notifyObservers() to notify the observers that it has changed.
The call to notifyObservers() could also be performed elsewhere, such as in an update loop running in another thread.

2.The update() methods on each of the observers are called, indicating that a change in state has occurred.
The observers access the model's data via the model's public accessor methods and update their respective views.

