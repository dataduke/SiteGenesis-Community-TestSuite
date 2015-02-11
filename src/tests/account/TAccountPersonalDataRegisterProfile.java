/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.account;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test register profile with create account via link in header.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Click register link in the header and goto the create account page</li>
 * <li>Enter profile data and submit the form</li>
 * <li>Logout using the link in the account area</li>
 * <li>Login again to validate login data</li>
 * <li>Validate personal profile data</li>
 * <li>Logout using the global link in the header</li>
 * </ul>
 * <h1 id="3-clean-up">3. Clean up</h1>
 * <ul>
 * <li>End session and clean up created cookies</li>
 * </ul>
 */
@ScriptName
("tests.account.TAccountPersonalDataRegisterProfile")
public class TAccountPersonalDataRegisterProfile extends AbstractScriptTestCase
{
}