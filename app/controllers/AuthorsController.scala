package controllers

import play.api.mvc._


class AuthorsController extends Controller{
  def authors: Action[AnyContent] = Action {
    Created("Authors")
  }

}
