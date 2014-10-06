package socialnetwork

class PostController {

    static scaffold = Post

    def index = {

        def posts = Post.list().reverse() // dumb way to get the recent posts on the top list
        def users = User.list(sort: "firstName", order:"asc")

        [posts: posts, users: users]

    }

    def save = {

        new Post(params).save()
        redirect action: "index"

    }


}
