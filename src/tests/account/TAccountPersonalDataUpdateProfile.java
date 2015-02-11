/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.account;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test update profile data in account.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Create new account with profile data</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Login using the prepared account</li>
 * <li>Update profile data (firstname, lastname and email)</li>
 * <li>Logout via corresponding link on account page</li>
 * <li>Login with new email</li>
 * <li>Validate new profile data</li>
 * <li>Logout via corresponding link on account page</li>
 * </ul>
 * <h1 id="3-clean-up">3. Clean up</h1>
 * <ul>
 * <li>End session and clean up created cookies</li>
 * </ul>
 */
@ScriptName
("tests.account.TAccountPersonalDataUpdateProfile")
public class TAccountPersonalDataUpdateProfile extends AbstractScriptTestCase
{
}