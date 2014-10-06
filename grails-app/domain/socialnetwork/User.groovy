package socialnetwork

class User {

    String firstName
    String lastName
    String userName
    String email
    String password
    Date birthday

    static hasMany = [friends:User, posts: Post]

    static constraints = {

        firstName blank:false
        lastName blank: false
        userName unique:true, blank: false
        email (blank: false, email: true)
        birthday blank: false
        password minSize: 5

    }

    String toString(){
        firstName+" "+lastName
    }
}
