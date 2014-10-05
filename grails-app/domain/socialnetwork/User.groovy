package socialnetwork

class User {

    String firstName
    String lastName
    String nickName
    String email
//    String password
    Date birthday

    static hasMany = [friends:User, posts:Post]

    static constraints = {

        firstName blank:false
        lastName blank: false
        nickName unique:true, blank: false
        email (blank: false, email: true)
        birthday blank: false

    }

    String toString(){
        firstName+" "+lastName
    }
}
