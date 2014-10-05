import socialnetwork.User

class BootStrap {

    def init = { servletContext ->
        new User(firstName:"Jonas", lastName:"Lins",nickName: "linsjonas", email:"jonas@gmail.com", birthday: new Date("01/06/1992")).save(failOnError: true)
        new User(firstName:"Leticia", lastName:"Lins",nickName: "bellalins", email:"bellalins@gmail.com", birthday: new Date("30/03/1988")).save(failOnError: true)
    }
    def destroy = {
    }
}
