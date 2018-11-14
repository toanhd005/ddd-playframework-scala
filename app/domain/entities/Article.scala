package domain.entities

import java.util.Date

import domain.valueobjects.{ ArticleID, FilePath }

case class Article(title: String, thumbnail: FilePath, content: String, id: ArticleID = ArticleID(0), createdOn: Date = null) {
  require(title.length > 0, "title is required")
  require(title.length <= 250, "max lenth of title is 250 characters")
  require(thumbnail.value.length > 0, "thumbnail is required")
  require(content.length > 0, "content is required")
}