/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.catalog;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test select, remove and clear color refinement on catalog page.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Browse to category</li>
 * <li>Select, validate and remove color via name</li>
 * <li>Select three colors via position</li>
 * <li>Remove one color via breadcrumb</li>
 * <li>Remove two colors clear</li>
 * <li>Validate empty color list</li>
 * <li>Validate empty refinement list in breadcrumbs</li>
 * </ul>
 * <h1 id="3-clean-up">3. Clean up</h1>
 * <ul>
 * <li>End session and clean up created cookies</li>
 * </ul>
 */
@ScriptName
("tests.catalog.TCatalogRefinementSelectRemoveColors")
public class TCatalogRefinementSelectRemoveColors extends AbstractScriptTestCase
{
}