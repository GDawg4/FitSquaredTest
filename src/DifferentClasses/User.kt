package DifferentClasses

data class User(
        var email: String,
        var password:String,
        var age: String,
        var levelOfExercise: String,
        var name: String,
        var weight: String,
        val history: History = History()
) {
}