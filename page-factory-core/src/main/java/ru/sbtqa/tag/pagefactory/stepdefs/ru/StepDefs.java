package ru.sbtqa.tag.pagefactory.stepdefs.ru;

import cucumber.api.DataTable;
import cucumber.api.java.ru.И;
import java.util.List;
import ru.sbtqa.tag.pagefactory.exceptions.PageInitializationException;
import ru.sbtqa.tag.pagefactory.stepdefs.GenericStepDefs;

public class StepDefs extends GenericStepDefs {

    /**
     * {@inheritDoc}
     */
    @Override
    @И("^(?:пользователь |он )?(?:находится на странице|открывается страница|открывается вкладка мастера) \"([^\"]*)\"$")
    public void openPage(String title) throws PageInitializationException {
        super.openPage(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @И("^(?:пользователь |он )?\\(([^)]*)\\)$")
    public void userActionNoParams(String action) throws NoSuchMethodException {
        super.userActionNoParams(action);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @И("^(?:пользователь |он )?\\(([^)]*)\\) (?:с параметром )?\"([^\"]*)\"$")
    public void userActionOneParam(String action, String param) throws NoSuchMethodException {
        super.userActionOneParam(action, param);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @И("^(?:пользователь |он )?\\(([^)]*)\\) (?:с параметрами )?\"([^\"]*)\" \"([^\"]*)\"$")
    public void userActionTwoParams(String action, String param1, String param2) throws NoSuchMethodException {
        super.userActionTwoParams(action, param1, param2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @И("^(?:пользователь |он )?\\(([^)]*)\\) (?:с параметрами )?\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void userActionThreeParams(String action, String param1, String param2, String param3) throws NoSuchMethodException {
        super.userActionThreeParams(action, param1, param2, param3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @И("^(?:пользователь |он )?\\(([^)]*)\\) данными$")
    public void userActionTableParam(String action, DataTable dataTable) throws NoSuchMethodException {
        super.userActionTableParam(action, dataTable);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @И("^(?:пользователь |он )?\\(([^)]*)\\) \"([^\"]*)\" данными$")
    public void userDoActionWithObject(String action, String param, DataTable dataTable) throws NoSuchMethodException {
        super.userDoActionWithObject(action, param, dataTable);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @И("^(?:пользователь |он )?\\(([^)]*)\\) из списка$")
    public void userActionListParam(String action, List<String> list) throws NoSuchMethodException {
        super.userActionListParam(action, list);
    }
}
