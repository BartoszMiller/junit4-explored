package explored;

import explored.category.CategorizedSampleTests;
import explored.category.QuickTestCategory;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(QuickTestCategory.class)
@Suite.SuiteClasses(CategorizedSampleTests.class)
public class CategoriesRunner {
}
