package controllers

import play.api.mvc._


class CharactersController extends Controller {
   def character: Action[AnyContent] = Action {
     Accepted("Characters")
   }
}
