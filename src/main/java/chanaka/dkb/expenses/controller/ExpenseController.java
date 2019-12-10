package chanaka.dkb.expenses.controller;


import chanaka.dkb.expenses.beans.Expense;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * list, create, update, read and delete expenses
 */
@Controller
public class ExpenseController {

    /**
     * List expenses for a given month
     * @param year
     * @param month
     * @return
     */
    public String getExpensesList(@RequestParam("year") String year, @RequestParam("month") String month) {
        return "list-expenses";
    }

    public String getExpense(@RequestParam("expenseId") int expenseId) {
        return "view-expense";
    }

    public String editExpense(@RequestParam("expenseId") int expenseId) {
        return "edit-expense";
    }

    /**
     * Persist the form data submitted for update or save an expense
     * @param expense
     * @return
     */
    public String saveExpense(@RequestParam("expense")Expense expense) {
        return "home";
    }

    /**
     * Delete a given expense
     * @param expenseId
     * @return
     */
    public String deleteExpense(@RequestParam("expenseId") int expenseId) {
        return "home";
    }
}
