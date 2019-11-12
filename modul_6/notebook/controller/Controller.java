package by.htp.notebook.controller;

import by.htp.notebook.controller.command.Command;
import by.htp.notebook.controller.command.CommandProvider;
import by.htp.notebook.service.NoteService;
import by.htp.notebook.service.ServiceProvider;

public class Controller {

    private CommandProvider commandProvider = new CommandProvider();

        public void doActToDisplayNotes () {

            System.out.println("Списко заметок в нашем блокноте:\n_______________");

            ServiceProvider serviceProvider = ServiceProvider.getInstance();
            NoteService noteService = serviceProvider.getNoteService();
            noteService.display();

        }

        public String doActToAddNote (String request) {

            String[] params = request.split("@ ");
            String commandName = params[0];
            String response = null;

            Command command = commandProvider.getCommand(commandName);
            response = command.execute(params);
            return response;
        }

        public String doActToRemoveNote (String request) {

            String[] params = request.split("@ ");
            String commandName = params[0];
            String response =null;

            Command command = commandProvider.getCommand(commandName);
            response = command.execute(params);
            return response;
        }

        public void doActToFindWord (String word){

            ServiceProvider serviceProvider = ServiceProvider.getInstance();
            NoteService noteService = serviceProvider.getNoteService();
            noteService.findWordInMessageAndSortByTopic(word);

        }
}
