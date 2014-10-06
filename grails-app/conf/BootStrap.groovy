import socialnetwork.Post
import socialnetwork.User

class BootStrap {

    def init = { servletContext ->

        def jonas = new User(firstName: "Jonas",
                lastName: "Lins",
                userName: "linsjonas",
                password: "user0",
                email: "jonas@gmail.com",
                birthday: new Date("01/06/1992")).save(failOnError: true)

        def leticia = new User(firstName:"Leticia",
                lastName:"Lins",
                userName: "bellalins",
                password: "user1",
                email:"bellalins@gmail.com",
                birthday: new Date("30/03/1988")).save(failOnError: true)

        leticia.addToPosts(new Post(text: "#groovy #grails #revisao #codigo #hashtag"))
        jonas.addToPosts(new Post(text: "Partiu revisão de código"))
        jonas.addToPosts(new Post(text: "Jonas just got engaged with Groovy on Grails s2"))
        leticia.addToPosts(new Post(text: "An awesome commentary is always an awesome commentary"))

    }
    def destroy = {
    }
}
