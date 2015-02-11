/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.checkout;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test new customer checkout with two variation products with color and size, different quantities, two saved addresses and credit card visa including validation after checkout of profile data in created account and order number in order history.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Add variation product 01 to cart (color, size, list price, quantity 1)</li>
 * <li>Add variation product 02 to cart (color, size, list and sales price, quantity 2)</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Start new customer checkout</li>
 * <li>Enter and confirm new profile data</li>
 * <li>Enter new shipping address, add it to address book and select configured shipping method</li>
 * <li>Enter new billing address, add it to address book and use payment method credit card (visa)</li>
 * <li>Validate place order page</li>
 * <li>Validate order confirmation page and store order number</li>
 * <li>Validate stored profile data in the account area</li>
 * <li>Validate stored addresses in account address book</li>
 * <li>Validate order history in account, check order number</li>
 * <li>Go to account</li>
 * <li>Validate customer name and profile</li>
 * <li>Validate shipping and billing address</li>
 * <li>Validate credit card in payment settings</li>
 * <li>Validate order via order history</li>
 * <li>Logout</li>
 * </ul>
 * <h1 id="3-clean-up">3. Clean up</h1>
 * <ul>
 * <li>End session and clean up created cookies</li>
 * </ul>
 */
@ScriptName
("tests.checkout.TCheckoutNewCustomerOrderProducts")
public class TCheckoutNewCustomerOrderProducts extends AbstractScriptTestCase
{
}