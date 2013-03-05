
public class Test {

    public Test() {
        //super();
    }
    
    public void testMethod() {
        //mail box is managed by mods.
        //stock is managed by mods.
        //posting price is managed my mods.
            //Batch post//How does it work?
        
        
        //Questions?
        //Do I use autocancel?
        
        
        //Phase 0:
        //Data entry. Does not have priority with automation...
        //Recepies.
        //
        
        //Phase 1 analyse:
        //Read auction data from blizzard.
        //Read item data from blizzard.
        //Read current stock
        //Determine actual sales/prices:
        //I need to be able to predict statistically the price of the item on day x, x+1, x+2 etc... Give the prices in the last two weeks.
        //First the price is not a single value, it is a distribution over a price range...
        //Determine the number of items sold per day. this is A
        //The chance that an item sells decreases is the price increases, even if there are no cheaper items available.
        //This coefficient factor is calculated as A(1), A(2), A(3), A(4) ..        
        //So lets take the chance per slot... The chance that there are A(1) items in price range lowest 10% is b(1)
        //So lets take the chance per slot... The chance that there are A(2) items in price range lowest 20% is b(2)
        //So lets take the chance per slot... The chance that there are A(3) items in price range lowest 30% is b(3)

        //To use these items in a predictability model I need to calculate how fast they change into each other. 
        //Can we determine how fast the shift is??? 
        //Determine the historical Matrix:
        //b(1)->b(1), b(1)->b(2), b(1)->b(3), b(1)->b(4), etc...
        //b(2)->b(1), b(2)->b(2), b(2)->b(3), b(2)->b(4), etc...
        
        //Is there a 24 hour/7day cycle? There must be peak hours for placement/sale of items.
        //I can do it historically, or make a model based on the number sold. Expiring auctions, replace rate.
        //I can determine when certain sellers replace their stock. And their replace strategy.
        //Can I do this for groups of items?? Changes are there is a relation between all herbs/ores/skins/etc.
        
        
        //Where do I want to be selling... Maximum profit...
        //What is maximum profit... If I buy/create y=1 I can sell at the highest point (minus the stock I have) =z in x days.
        //What is maximum profit... If I buy/create y=2 I can sell at the 2nd highest point (minus the stock I have) =z in x days.
        //What is maximum profit... If I buy/create y=3 I can sell at the 3rd highest point (minus the stock I have) =z in x days.
        //...etc.
        //Calculate for x = 1, 2, 3, 4, 5, 6, 7... Divide result by x for profit per day...
        //Find the highest profit per day point for x , y
        //For now I just place it in the AH at point z.

        //Question, is there a clear day of week trend in sales/places?? This will effect my algorithm. 
        //Is there an overall price inflation per item??? This will effect my algorith.
        
        //At some point the profit goes down because I start  making a loss. That is how many I want to have..
        
        //Now for the days... 
        //I could repeat the algorithm above while increasing the day's.  
        //If I buy one item at lowest cost and sell it at highest in 7 days Profit will be higher than one day. But the profit per day will be lower.
        

  
        //Determine what stock I would need
        //Subtract my current stock
        
        
        
    }
    
}
