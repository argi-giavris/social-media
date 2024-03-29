package org.example.controllers.comment;

import io.javalin.http.Context;
import org.example.dto.CommentContentAndPostDto;
import org.example.dto.UserUsernameAndRoleDto;
import org.example.services.comment.CreateCommentService;
import org.example.utils.JwtUtils;

import java.sql.SQLException;


public class CreateCommentController {

    public void comment(Context ctx) throws SQLException {
        CommentContentAndPostDto comment = ctx.bodyAsClass(CommentContentAndPostDto.class);
        UserUsernameAndRoleDto commentator = JwtUtils.getUserFromJwt(ctx);

        CreateCommentService.createComment(comment, commentator);
        ctx.status(201).json(comment.getContent());

    }
}
