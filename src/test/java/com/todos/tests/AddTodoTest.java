package com.todos.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.todos.e2e.pages.TodoPage;
import com.todos.e2e.utils.Setup;

public class AddTodoTest extends Setup{

	public AddTodoTest() throws IOException {
		super();
	}

	TodoPage todoPage;
	@Test
	public void iCanAddTodo() throws IOException {
		
		todoPage = new TodoPage();
		todoPage.submitTodo(prop.getProperty("todo1"));
	}
}
