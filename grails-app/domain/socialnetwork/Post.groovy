package socialnetwork

class Post {
    String text
    static belongsTo = [user: User]

    static constraints = {
        text blank: false, maxSize: 500

    }

    String toString(){
        text
    }

}
