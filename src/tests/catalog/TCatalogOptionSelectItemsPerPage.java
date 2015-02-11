/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.catalog;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test select items per page option on catalog page.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Select Items per page via position</li>
 * <li>Validate result page</li>
 * <li>Select Items per page via random</li>
 * <li>Validate result page</li>
 * <li>Select Items per page via all labels</li>
 * <li>Validate result page</li>
 * </ul>
 * <h1 id="3-clean-up">3. Clean up</h1>
 * <ul>
 * <li>End session and clean up created cookies</li>
 * </ul>
 * <h2 id="note">Note</h2>
 * <p>Executing this test case using script developer leads to the following message: 
 * &quot;The following test data placeholders could not be resolved: itemsPerPageCount Replay the script anyway?&quot; </p>
 * <p>Please ignore this message, it is a known script developer issue (<a href="https://lab.xceptance.de/issues/2349">https://lab.xceptance.de/issues/2349</a>).</p>
 */
@ScriptName
("tests.catalog.TCatalogOptionSelectItemsPerPage")
public class TCatalogOptionSelectItemsPerPage extends AbstractScriptTestCase
{
}