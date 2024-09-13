package com.demoqa.pages.widgets;

import static utilities.DropDownUtility.deselectByValue;
import static utilities.DropDownUtility.getAllSelectedOptions;
import static utilities.DropDownUtility.selectByIndex;
import static utilities.DropDownUtility.selectByVisibleText;
import static utilities.JavaScriptUtility.scrollToElementJS;

import java.util.List;

import org.openqa.selenium.By;

public class SelectMenuPage extends WidgetsPage {

  private By standardMultiSelect = By.id("cars");

  public void selectStandardMulti(String text) {
    scrollToElementJS(standardMultiSelect);
//    Select select = new Select(find(standardMultiSelect));
//    select.selectByVisibleText(text);
    selectByVisibleText(standardMultiSelect, text);
  }

  public void selectStandardMulti(int index) {
    scrollToElementJS(standardMultiSelect);
    selectByIndex(standardMultiSelect, index);
  }

  public void deselectStandardMulti(String value) {
    scrollToElementJS(standardMultiSelect);
    deselectByValue(standardMultiSelect, value);
  }

  public List<String> getAllSelectedStandardMultiOptions() {
    return getAllSelectedOptions(standardMultiSelect);
  }
}















