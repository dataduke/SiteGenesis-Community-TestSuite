/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.minicart;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test refresh products with update quantity and resort rows in mini cart.
 * <strong>Caution:</strong> Browser window needs to be 1200 pixels wide to show totals subtotal in header.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Add product 01 to cart (quantity 1)</li>
 * <li>Add product 02 to cart (quantity 2)</li>
 * <li>Store subtotal</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <h2 id="product-01-and-02-validate-products">Product 01 and 02 - Validate products</h2>
 * <ul>
 * <li>Validate header items</li>
 * <li>Validate body product 01 in row 2</li>
 * <li>Validate body product 02 in row 1</li>
 * <li>Validate body subtotal</li>
 * </ul>
 * <h2 id="product-01-and-02-change-quantities">Product 01 and 02 - Change quantities</h2>
 * <ul>
 * <li>Change product 01 quantity to 3</li>
 * <li>Change product 02 quantity to 4</li>
 * <li>Validate updated header items</li>
 * <li>Validate updated mini cart body product 01 in row 2</li>
 * <li>Validate updated mini cart body product 02 in row 1</li>
 * <li>Validate updated mini cart body subtotal</li>
 * </ul>
 * <h2 id="product-01-and-02-remove-and-rearrange-rows">Product 01 and 02 - Remove and rearrange rows</h2>
 * <ul>
 * <li>Remove product 02</li>
 * <li>Validate updated mini cart body product 01 in row 1</li>
 * <li>Remove product 01</li>
 * <li>Validate empty cart</li>
 * <li>Validate empty mini cart</li>
 * </ul>
 * <h1 id="3-clean-up">3. Clean up</h1>
 * <ul>
 * <li>End session and clean up created cookies</li>
 * </ul>
 */
@ScriptName
("tests.minicart.TMiniCartRefreshProducts")
public class TMiniCartRefreshProducts extends AbstractScriptTestCase
{
}