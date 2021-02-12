package com.todos.tests;

import java.io.IOException;

import org.junit.Assert;
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
		boolean elementText = todoPage.isElementDisplayed(TodoPage.inputText);
		Assert.assertTrue(elementText);
		todoPage.submitTodo(prop.getProperty("todo1"));
		String element = todoPage.checkElementContains(TodoPage.elementTodo);
		Assert.assertTrue(element.contains(prop.getProperty("todo1")));
		boolean check_box = todoPage.IsCheckBoxSelected(TodoPage.checkbox);
		Assert.assertFalse(check_box);

	}
}
