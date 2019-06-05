package controllers

import play.api.mvc._


class HomeController extends Controller {
  def home: Action[AnyContent] = Action {
    Ok(views.html.index())
  }
}

//This is an example of how a webpage is created, each of the webpages exist in the package called controllers//
//Controller is functionality that is gained through importing play.api.mvc.Controller//
//An action is something that takes in a response and gives out a result//
