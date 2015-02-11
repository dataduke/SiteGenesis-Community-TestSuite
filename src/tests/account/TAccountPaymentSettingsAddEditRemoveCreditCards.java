/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.account;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test add, edit and remove credit card data in account payment settings.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Create new account with profile data</li>
 * <li>Login to account using the global link in the header</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Go to payment settings</li>
 * <li>Validate nav, page and empty list</li>
 * <li>Add credit card and cancel dialog</li>
 * <li>Create two new credit cards and validate both</li>
 * <li>Remove both credit cards and validate resorting</li>
 * <li>Validate empty list</li>
 * </ul>
 * <h1 id="3-clean-up">3. Clean up</h1>
 * <ul>
 * <li>Logout using the global link in the header</li>
 * <li>End session and clean up created cookies</li>
 * </ul>
 */
@ScriptName
("tests.account.TAccountPaymentSettingsAddEditRemoveCreditCards")
public class TAccountPaymentSettingsAddEditRemoveCreditCards extends AbstractScriptTestCase
{
}