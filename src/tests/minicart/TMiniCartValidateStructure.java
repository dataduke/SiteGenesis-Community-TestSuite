/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.minicart;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test add and remove product in mini cart.
 * <strong>Caution:</strong> Browser window needs to be 1200 pixels wide to show totals subtotal in header.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Add basic product to cart</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Validate mini cart header</li>
 * <li>Validate mini cart header items</li>
 * <li>Open mini cart body</li>
 * <li>Validate product inside mini cart body</li>
 * <li>Validate subtotal inside mini cart body</li>
 * <li>Remove product from cart</li>
 * <li>Validate empty cart</li>
 * <li>Validate empty mini cart</li>
 * </ul>
 * <h1 id="3-clean-up">3. Clean up</h1>
 * <ul>
 * <li>End session and clean up created cookies</li>
 * </ul>
 */
@ScriptName
("tests.minicart.TMiniCartValidateStructure")
public class TMiniCartValidateStructure extends AbstractScriptTestCase
{
}