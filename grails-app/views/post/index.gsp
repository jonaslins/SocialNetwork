<%--
  Created by IntelliJ IDEA.
  User: Jonas
  Date: 05/10/2014
  Time: 16:52
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>SocialNetwork</title>
        <blueprint:resources/>
        <link href="${resource(dir: 'css', file: 'post_timeline.css')}" type="text/css" rel="stylesheet">
    </head>
    <body>
        <div class="container">

            <h1 class="span-24 last">SocialNetwork - Timeline</h1>

            <div class="span-24 last">
                <div class="span-16">
                    <g:form action="save">
                        <g:textArea name="text" required="" class="post-textarea" />
                        <br>
                        <label for="user"> Post as user: </label>
                        <select id="user" name="user.id" required="" class="many-to-one" >
                            <g:each in="${ users }" status="i" var="user">
                                <option value=${i+1} >${user}</option>
                            </g:each>
                        </select>
                        <g:actionSubmit value="Comentar" action="save"/>
                    </g:form>
                </div>
                <div class="span-4 last"></div>
            </div>

            <div class="span-20">
                <g:each in="${ posts }" status="i" var="post">
                    <div class="post${i%2}">
                        <h4>${ post.user } wrote: </h4>
                        <p> ${ post.text } </p>
                    </div>
                </g:each>
            </div>

            <div class="span-4 last">
                <dl class="sidebar">
                    <dt>Users</dt>
                    <dd>
                        <ul>
                            <g:each in="${ users }" var="user">
                                <li>${ user.toString() }</li>
                            </g:each>
                        </ul>
                    </dd>
                </dl>
            </div>

        </div>

    </body>
</html>