/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.checkout;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test guest checkout with one variation product with color and size, one address and visa. </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Add variation product having color and size to cart (quantity 1)</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Start guest checkout</li>
 * <li>Enter new address and use preselected  default shipping method</li>
 * <li>Use same as shipping address for billing and use payment method credit card (visa)</li>
 * <li>Validate place order page</li>
 * <li>Validate order confirmation page</li>
 * <li>Go to account</li>
 * <li>Validate customer name and profile</li>
 * <li>Validate order via order history</li>
 * <li>Logout</li>
 * </ul>
 * <h1 id="3-clean-up">3. Clean up</h1>
 * <ul>
 * <li>End session and clean up created cookies</li>
 * </ul>
 */
@ScriptName
("tests.checkout.TCheckoutGuestOrderProduct")
public class TCheckoutGuestOrderProduct extends AbstractScriptTestCase
{
}